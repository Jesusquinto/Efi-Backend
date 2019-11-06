package com.apirest.efi.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.apirest.efi.models.entity.Responsables;
import com.apirest.efi.models.entity.ResultadoEncuesta;
import com.apirest.efi.models.entity.Usuarios;
import com.apirest.efi.models.services.ResponsablesService;
import com.apirest.efi.models.services.ResultadoEncuestaService;
import com.apirest.efi.models.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/efi/")
public class ResponsablesController {

    @Autowired
    private ResponsablesService responsablesService;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private ResultadoEncuestaService resultadoEncuestaService;

    @GetMapping("responsables/empresa/encuesta/{idResultadoEncuesta}")
    public List<Responsables> findResponsablesByEmpresa(OAuth2Authentication auth, @PathVariable("idResultadoEncuesta") Long idResultadoEncuesta){
        String username = auth.getPrincipal().toString();
        Usuarios user = usuarioService.findByUsername(username);
        return responsablesService.listByIdEmpresa(user.getIdEmpresa().getId(), idResultadoEncuesta);
    }

    @GetMapping("responsables/respuestas/{idResultadoEncuesta}")
    public List<Responsables> findResponsables(OAuth2Authentication auth, @PathVariable("idResultadoEncuesta") Long idResultadoEncuesta){
        String username = auth.getPrincipal().toString();
        Usuarios user = usuarioService.findByUsername(username);
        return responsablesService.listResponsables( idResultadoEncuesta);
    }




    @PostMapping("responsables/save")
    public Responsables save(@RequestBody Responsables responsable, OAuth2Authentication auth){
        String username = auth.getPrincipal().toString();
        Usuarios user = usuarioService.findByUsername(username);
        responsable.setIdEmpresa(user.getIdEmpresa());
        return responsablesService.save(responsable);        
    }

    @PostMapping("responsables/varios/save/{idResultadoEncuesta}")
    public ResponseEntity<?> saveVarios(@RequestBody List<Responsables> responsables, OAuth2Authentication auth, @PathVariable("idResultadoEncuesta") Long idResultadoEncuesta){
         Map<String, Object> response = new HashMap<>(); 
        try{
            String username = auth.getPrincipal().toString();
            Usuarios user = usuarioService.findByUsername(username);
            ResultadoEncuesta encuesta = resultadoEncuestaService.findById(idResultadoEncuesta);
            responsables.forEach((r) ->{
                r.setIdEmpresa(user.getIdEmpresa());
                r.setResultadoEncuesta(encuesta);
                r.setConfirmacion(0);
                responsablesService.save(r);
            });
        }catch(Exception e){
            response.put("mensaje", "Error al agregar responsables!");
            response.put("error", e);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);  
        }
    
            response.put("mensaje", "Responsables agregados!");
            response.put("responsables", responsables);  
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);  
    }
 
  
}
