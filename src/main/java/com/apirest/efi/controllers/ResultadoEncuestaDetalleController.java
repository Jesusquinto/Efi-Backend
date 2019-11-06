package com.apirest.efi.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import com.apirest.efi.models.entity.Responsables;
import com.apirest.efi.models.entity.ResultadoEncuesta;
import com.apirest.efi.models.entity.ResultadoEncuestaDetalle;
import com.apirest.efi.models.entity.Usuarios;
import com.apirest.efi.models.services.ResponsablesService;
import com.apirest.efi.models.services.ResultadoEncuestaDetalleService;
import com.apirest.efi.models.services.ResultadoEncuestaService;
import com.apirest.efi.models.services.SendMailService;
import com.apirest.efi.models.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/efi/")
public class ResultadoEncuestaDetalleController {

  @Autowired
  private ResultadoEncuestaDetalleService resultadoEncuestaDetalleService;

  @Autowired
  private SendMailService sendMailService;
  
  @Autowired
  private UsuarioService usuarioService;
  
  @Autowired ResultadoEncuestaService resultadoEncuestaService;
  
  @Autowired
  private ResponsablesService responsableService;

  @GetMapping("resultadoencuestaDetalle")
  public List<ResultadoEncuestaDetalle> findAll() {
    return resultadoEncuestaDetalleService.findAll();
  }

  @GetMapping("resultadoencuestaDetalle/{id}")
  public ResultadoEncuestaDetalle findById(@PathVariable("id") Long id) {
    return resultadoEncuestaDetalleService.findById(id);
  }

  @PostMapping("resultadoencuestaDetalle")
  public ResultadoEncuestaDetalle save(@RequestBody ResultadoEncuestaDetalle resultadoEncuestaDetalle) {
    return resultadoEncuestaDetalleService.save(resultadoEncuestaDetalle);
  }

  @PostMapping("resultadoencuestaDetalle/preguntas")
  public List<ResultadoEncuestaDetalle> saveVarios(
      @RequestBody List<ResultadoEncuestaDetalle> resultadoEncuestaDetalle) {
      Usuarios user = usuarioService.findById(resultadoEncuestaDetalle.get(0).getIdResultadoEncuesta().getIdUsuario().getId());
      ResultadoEncuesta encuesta = resultadoEncuestaService.findById(resultadoEncuestaDetalle.get(0).getIdResultadoEncuesta().getId());
    resultadoEncuestaDetalle.forEach((e) -> {
      if (e.getResultado() == 2) {
        e.setSeguimiento((short) 0);
        e.setFechaSeguimiento(new Date());
      }
      resultadoEncuestaDetalleService.save(e);
    });
    List<Responsables> responsables;
    responsables = resultadoEncuestaDetalleService.getResponsables(resultadoEncuestaDetalle.get(0).getIdResultadoEncuesta().getId());
    responsables.forEach((r) -> {
              System.out.println(r.getCorreo());
      try {
        sendMailService.sendMailAnswersConfirmation(r, resultadoEncuestaDetalle, user, encuesta);
      } catch (MessagingException e1) {
        e1.printStackTrace();
      }
      });
		return resultadoEncuestaDetalle;
    }
    
    
    @PutMapping("resultadoencuestaDetalle")
    public ResultadoEncuestaDetalle edit(@RequestBody ResultadoEncuestaDetalle resultadoEncuestaDetalle) {
        ResultadoEncuestaDetalle resultadoEncuestaDetalleActual = new ResultadoEncuestaDetalle();
        ResultadoEncuestaDetalle resultadoEncuestaDetalleUpdate = new ResultadoEncuestaDetalle();
        resultadoEncuestaDetalleActual = resultadoEncuestaDetalleService.findById(resultadoEncuestaDetalle.getId());

        if (resultadoEncuestaDetalleActual != null) {
            resultadoEncuestaDetalleUpdate = resultadoEncuestaDetalleService.save(resultadoEncuestaDetalle);
        }	

        return resultadoEncuestaDetalleUpdate;
      }
    
     @GetMapping("resultadoencuestadetalle/{idResultadoEncuesta}")    

     public List<ResultadoEncuestaDetalle> getByResultadoEncuesta(@PathVariable("idResultadoEncuesta") Long idResultadoEncuesta){
         return resultadoEncuestaDetalleService.findByResultadoEncuesta(idResultadoEncuesta);
     }
     


     @GetMapping("confirmar/usuarioefi/{idResultadoEncuesta}")
     public ResponseEntity<?> confirmResultadosUser(@PathVariable("idResultadoEncuesta") long idResultadoEncuesta){
      Map<String, Object> response = new HashMap<>();
      try{
        ResultadoEncuesta encuesta = resultadoEncuestaService.findById(idResultadoEncuesta);
        List<Responsables> responsables = responsableService.listResponsables(encuesta.getId());
        boolean flag = true;
  
        for (int i = 0; i < responsables.size(); i++) {
            if(responsables.get(i).getConfirmacion() == 0){
              flag = false;
            }
        }
  
  
        if(encuesta.getUserConfirmacion() == 1){
          response.put("mensaje", "La encuesta ya ha sido confirmada");  
          return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST); 
        }
  
        encuesta.setUserConfirmacion(1);
        encuesta.setFechaConfirmacion(new Date());
        resultadoEncuestaService.save(encuesta);
  
        if(flag == true){
          encuesta.setEstado(1);
          resultadoEncuestaService.save(encuesta);
        }
  
        sendMailService.sendUserAnswersConfirmation(encuesta.getIdUsuario(), encuesta);
  
        response.put("mensaje", "La encuesta ha sido confirmada");  
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED); 

      }catch(Exception e){
        response.put("mensaje", "Error al confirmar las respuestas!");  
       return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);  
     }
     }


     
     @GetMapping("confirmar/{idResultadoEncuesta}/{idResponsable}")     
     public ResponseEntity<?> confirmResultados(@PathVariable("idResultadoEncuesta") Long idResultadoEncuesta, @PathVariable("idResponsable") Long idResponsable){
        Map<String, Object> response = new HashMap<>(); 

         try{
          ResultadoEncuesta encuesta = resultadoEncuestaService.findById(idResultadoEncuesta);
          Usuarios user = usuarioService.findById(encuesta.getIdUsuario().getId());
          Responsables responsable = responsableService.findById(idResponsable);


           if(responsable.getConfirmacion() == 0){
             responsable.setConfirmacion(1);
             responsable.setFechaConfirmacion(new Date());
             responsableService.save(responsable);
           }else{
            response.put("mensaje", "Las respuestas ya han sido confirmadas");  
           return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR); 
           }

    
         //OBTENER TODOS LOS REPONSABLES Y DETERMINAR SI TODOS CONFIRMARON SUS RESPUESTAS, POSTERIORMENTE CAMBIAR EL ESRADO DE LA ENCUESTA REALIZADA

           List<Responsables> responsables = responsableService.listResponsables(idResultadoEncuesta);
           Boolean flag = true;
           for (int i = 0; i < responsables.size(); i++) {
              if(responsables.get(i).getConfirmacion() == 0){
                flag = false;
              }
           }


           if(flag == true){
             if(encuesta.getUserConfirmacion() == 1){
              encuesta.setEstado(1);
              resultadoEncuestaService.save(encuesta);
             }
           }
       

         sendMailService.sendMailAnswersConfirmationBackUser(user,encuesta,responsable);


         }catch(Exception e){
            response.put("mensaje", "Error al confirmar las respuestas!");  
           return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);  
         }
       
         
          response.put("mensaje", "Respuestas confirmadas!");  
           return new ResponseEntity<>(response, HttpStatus.ACCEPTED);  
       
     }


     
     @GetMapping("resultadoencuestadetalle/responsable/{idResponsable}")     
     public List<ResultadoEncuestaDetalle> findByIdResponsable(@PathVariable("idResponsable") Long idResponsable){
      return resultadoEncuestaDetalleService.findByIdResponsable(idResponsable);
     }



    
}
