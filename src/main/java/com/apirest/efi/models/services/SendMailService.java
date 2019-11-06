package com.apirest.efi.models.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import com.apirest.efi.models.entity.Responsables;
import com.apirest.efi.models.entity.ResultadoEncuesta;
import com.apirest.efi.models.entity.ResultadoEncuestaDetalle;
import com.apirest.efi.models.entity.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

/**
 *
 * @author jesus
 */
@Service
public class SendMailService {
    
        @Autowired
        private JavaMailSender javaMailSender;
        
        
        private String url = "http://atlantico.efi.gtsdev.co/confirmar/";
        private String urlUser = "http://atlantico.efi.gtsdev.co/confirmar/usuarioefi/";

         public void sendMailAnswersConfirmationBackUser(Usuarios user, ResultadoEncuesta encuesta, Responsables responsable) throws MessagingException {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-d HH:mm");
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("noreply.efigestion@gmail.com");
            helper.setTo(user.getEmail());
            helper.setSubject("EFI !"+responsable.getNombre() +" "+responsable.getIdentificacion()+" Ha confirmado sus preguntas - "+encuesta.getConsecutivo());
            helper.setText("<html><head></head><body style=\"\n" +
                            "    text-align: center;\n" +
                            "\">\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "<img src=\"https://i.ibb.co/MNHtv3x/info-efi-email.png\">\n" +
                            "<h2 style=\"\n" +
                            "    font-family: sans-serif;\n" +
                            "    font-weight: 800;\n" +
                            "    margin-bottom: .55rem;\n" +
                            "    color: #3354dd;\n" +
                            "    margin-top: 0px;\n" +
                            "    font-stretch: semi-condensed;\n" +
                            "    \">RESPUESTAS CONFIRMADAS</h2>\n" +
                            "\n" +
                            "\n" +
                            "<h2 style=\"\n" +
                            "    font-family: sans-serif;\n" +
                            "    font-weight: 800;\n" +
                            "    color: #3354dd;\n" +
                            "    margin-top: 2px;\n" +
                            "    font-stretch: condensed;\n" +
                            "\">"+encuesta.getConsecutivo()+"</h2>\n" +
                            "<h3 style=\"\n" +
                            "    position: relative;\n" +
                            "    top: -1rem;\n" +
                            "    font-family: sans-serif;\n" +
                            "    color: #33477b;\n" +
                            "    font-stretch: condensed;\n" +
                            "    margin-bottom: 0px;\n" +
                            "\">El responsable "+ responsable.getNombre() +" "+responsable.getApellido() +" - "+ responsable.getIdentificacion() +" ha confirmado las respuestas de su encuesta</h3>\n" +
                            "\n" +
                            "	\n" +
                            "\n" +
                            "<h2 style=\"\n" +
                            "    font-family: sans-serif;\n" +
                            "    font-weight: 800;\n" +
                            "    color: #3354dd;\n" +
                            "    margin-top: 0px;\n" +
                            "    font-stretch: ultra-condensed;\n" +
                            "\">Fecha de confirmación</h2>\n" +
                            "<h3 style=\"\n" +
                            "    position: relative;\n" +
                            "    top: -1rem;\n" +
                            "    font-family: sans-serif;\n" +
                            "    color: #33477b;\n" +
                            "    font-stretch: condensed;\n" +
                            "\">"+format.format(new Date())+"</h3>\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "</body></html>",true);
                        javaMailSender.send(message);


            helper.setFrom("noreply.efigestion@gmail.com");
            helper.setTo(responsable.getCorreo());
            helper.setSubject("EFI ¡Ha confirmado sus respuestas!");
            helper.setText("<html><head></head><body style=\"\n" +
                            "    text-align: center;\n" +
                            "\">\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "<img src=\"https://i.ibb.co/MNHtv3x/info-efi-email.png\">\n" +
                            "<h2 style=\"\n" +
                            "    font-family: sans-serif;\n" +
                            "    font-weight: 800;\n" +
                            "    margin-bottom: .55rem;\n" +
                            "    color: #3354dd;\n" +
                            "    margin-top: 0px;\n" +
                            "    font-stretch: semi-condensed;\n" +
                            "    \">ENCUESTA CONFIRMADA!</h2>\n" +
                            "\n" +
                            "\n" +
                            "<h2 style=\"\n" +
                            "    font-family: sans-serif;\n" +
                            "    font-weight: 800;\n" +
                            "    color: #3354dd;\n" +
                            "    margin-top: 2px;\n" +
                            "    font-stretch: condensed;\n" +
                            "\">"+encuesta.getConsecutivo()+"</h2>\n" +
                            "<h3 style=\"\n" +
                            "    position: relative;\n" +
                            "    top: -1rem;\n" +
                            "    font-family: sans-serif;\n" +
                            "    color: #33477b;\n" +
                            "    font-stretch: condensed;\n" +
                            "    margin-bottom: 0px;\n" +
                            "\">Ha confirmado sus respuestas exitosamente</h3>\n" +
                            "\n" +
                            "	\n" +
                            "\n" +
                            "<h2 style=\"\n" +
                            "    font-family: sans-serif;\n" +
                            "    font-weight: 800;\n" +
                            "    color: #3354dd;\n" +
                            "    margin-top: 0px;\n" +
                            "    font-stretch: ultra-condensed;\n" +
                            "\">Fecha de confirmación</h2>\n" +
                            "<h3 style=\"\n" +
                            "    position: relative;\n" +
                            "    top: -1rem;\n" +
                            "    font-family: sans-serif;\n" +
                            "    color: #33477b;\n" +
                            "    font-stretch: condensed;\n" +
                            "\">"+format.format(new Date())+"</h3>\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "</body></html>",true);
                                    javaMailSender.send(message);


         }

         
       
         
         
            public void sendUserAnswersConfirmation(Usuarios user, ResultadoEncuesta encuesta) throws MessagingException{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-d HH:mm");
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("noreply.efigestion@gmail.com");
            helper.setTo(user.getEmail());
            helper.setSubject("EFI ¡Ha confirmado la encuesta "+encuesta.getConsecutivo() +" con exito!");
            helper.setText("<html><head></head><body style=\"\n" +
            "    text-align: center;\n" +
            "\">\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "<img src=\"https://i.ibb.co/MNHtv3x/info-efi-email.png\">\n" +
            "<h2 style=\"\n" +
            "    font-family: sans-serif;\n" +
            "    font-weight: 800;\n" +
            "    margin-bottom: .55rem;\n" +
            "    color: #3354dd;\n" +
            "    margin-top: 0px;\n" +
            "    font-stretch: semi-condensed;\n" +
            "    \">ENCUESTA CONFIRMADA!</h2>\n" +
            "\n" +
            "\n" +
            "<h2 style=\"\n" +
            "    font-family: sans-serif;\n" +
            "    font-weight: 800;\n" +
            "    color: #3354dd;\n" +
            "    margin-top: 2px;\n" +
            "    font-stretch: condensed;\n" +
            "\">"+encuesta.getConsecutivo()+"</h2>\n" +
            "<h3 style=\"\n" +
            "    position: relative;\n" +
            "    top: -1rem;\n" +
            "    font-family: sans-serif;\n" +
            "    color: #33477b;\n" +
            "    font-stretch: condensed;\n" +
            "    margin-bottom: 0px;\n" +
            "\">Ha confirmado la realización de su encuesta, exitosamente</h3>\n" +
            "\n" +
            "	\n" +
            "\n" +
            "<h2 style=\"\n" +
            "    font-family: sans-serif;\n" +
            "    font-weight: 800;\n" +
            "    color: #3354dd;\n" +
            "    margin-top: 0px;\n" +
            "    font-stretch: ultra-condensed;\n" +
            "\">Fecha de confirmación</h2>\n" +
            "<h3 style=\"\n" +
            "    position: relative;\n" +
            "    top: -1rem;\n" +
            "    font-family: sans-serif;\n" +
            "    color: #33477b;\n" +
            "    font-stretch: condensed;\n" +
            "\">"+format.format(new Date())+"</h3>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "</body></html>",true);
            javaMailSender.send(message);



            }





        public void sendMailAnswersConfirmation(Responsables responsable, List<ResultadoEncuestaDetalle> resultados, Usuarios user, ResultadoEncuesta encuesta) throws MessagingException {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-d HH:mm");
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("noreply.efigestion@gmail.com");
            helper.setTo(responsable.getCorreo());
            helper.setSubject("EFI ¡Confirmación de respuestas!");
            helper.setText("<html><head></head><body style=\"\n" +
                            "    text-align: center;\n" +
                            "\">\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "<img src=\"https://i.ibb.co/MNHtv3x/info-efi-email.png\">\n" +
                            "<h2 style=\"\n" +
                            "    font-family: sans-serif;\n" +
                            "    font-weight: 800;\n" +
                            "    margin-bottom: .55rem;\n" +
                            "    color: #3354dd;\n" +
                            "    margin-top: 0px;\n" +
                            "    font-stretch: semi-condensed;\n" +
                            "    \">CONFIRME SUS RESPUESTAS</h2>\n" +
                            "<h1 style=\"\n" +
                            "    font-family: sans-serif;\n" +
                            "    color: #33477b;\n" +
                            "    margin-top: 0;\n" +
                            "    font-size : 1.5rem;\n" +
                            "    margin-bottom: 0px;\n" +
                            "    font-stretch: extra-condensed;\n" +
                            "    position: relative;\n" +
                            "    top: -1rem;\n" +
                            "\">"+encuesta.getConsecutivo()+"</h1>\n" +
                            "\n" +
                            "<div style=\"/* max-height: 300px; */\">\n" +
                            "\n" +
                            "	\n" +
                            "<table class=\"egt\" style=\"margin: 0 auto;font-family: sans-serif;display: block;background: #e8ecff;color: #434550;border: 1px solid #efefef;text-align: left;/* border-radius: 7px; */border-collapse: collapse;width: 595px;height: 350px;box-shadow: inset 0px 0px 8px 0px #d6d6d6;overflow: overlay;\" border=\"1\">\n" +
                            "\n" +
                            "  <tbody><tr style=\"\n" +
                            "    background: #4f61a1;\n" +
                            "    color: white;\n" +
                            "    text-align: center;\n" +
                            "    /* border: 1px solid #b1b1b1; */\n" +
                            "\">\n" +
                            "\n" +
                            "    <th scope=\"row\" style=\"\n" +
                            "    width: 300px;\n" +
                            "\">Preguntas</th>\n" +
                            "\n" +
                            "    <th>Respuestas</th>\n" +
                            "\n" +
                            "    <th>responsable</th>\n" +
                            "\n" +
                            "  </tr>" +
                            "\n" +
                            setResultados(resultados, responsable)
                           +
                            "</tbody></table>\n" +
                            "\n" +
                            "\n" +
                            "</div>\n" +
                            "\n" +
                            "<h2 style=\"\n" +
                            "    font-family: sans-serif;\n" +
                            "    font-weight: 800;\n" +
                            "    color: #3354dd;\n" +
                            "    margin-top: 2px;\n" +
                            "    font-stretch: condensed;\n" +
                            "\">Realizador de la encuesta</h2>\n" +
                            "<h3 style=\"\n" +
                            "    position: relative;\n" +
                            "    top: -1rem;\n" +
                            "    font-family: sans-serif;\n" +
                            "    color: #33477b;\n" +
                            "    font-stretch: condensed;\n" +
                            "    margin-bottom: 0px;\n" +
                            "\">"+user.getNombre()+" "+user.getApellido()+" - "+user.getDocumento() +"</h3>\n" +
                            "\n" +
                            "	\n" +
                            "\n" +
                            "<h2 style=\"\n" +
                            "    font-family: sans-serif;\n" +
                            "    font-weight: 800;\n" +
                            "    color: #3354dd;\n" +
                            "    margin-top: 0px;\n" +
                            "    font-stretch: ultra-condensed;\n" +
                            "\">Fecha de realización</h2>\n" +
                            "<h3 style=\"\n" +
                            "    position: relative;\n" +
                            "    top: -1rem;\n" +
                            "    font-family: sans-serif;\n" +
                            "    color: #33477b;\n" +
                            "    font-stretch: condensed;\n" +
                            "\">"+ format.format(encuesta.getFecha()) +"</h3>\n" +
                            "\n" +
                            "<a onmouseover=\"this.style.background='#7289ea'; this.style.cursor='pointer'\" onmouseout=\"this.style.background='#334678'; this.style.cursor='default'\" style=\"text-decoration: none; background: rgb(51, 72, 130); color: white; padding: 15px; font-size: medium; border-radius: 4px; font-family: sans-serif; cursor: default;\" href=\""+this.url+encuesta.getId()+"/"+responsable.getId()+"\">Confirmar</a>\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "</body></html>", true);

            javaMailSender.send(message);
            
            
            
            message = javaMailSender.createMimeMessage();
            helper = new MimeMessageHelper(message, true);
            helper.setFrom("noreply.efigestion@gmail.com");
            helper.setTo(user.getEmail());
            helper.setSubject("EFI ¡La encuesta "+encuesta.getConsecutivo()+" ha sido realizada con exito, confirmela!");
            helper.setText("<html><head></head><body style=\"\n" +
                            "    text-align: center;\n" +
                            "\">\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "<img src=\"https://i.ibb.co/MNHtv3x/info-efi-email.png\">\n" +
                            "<h2 style=\"\n" +
                            "    font-family: sans-serif;\n" +
                            "    font-weight: 800;\n" +
                            "    margin-bottom: .55rem;\n" +
                            "    color: #3354dd;\n" +
                            "    margin-top: 0px;\n" +
                            "    font-stretch: semi-condensed;\n" +
                            "    \">Usted ha realizado una encuesta de "+encuesta.getIdEncuesta().getNombre()+" a la entidad "+encuesta.getIdEntidad().getEntidad()+"</h2>\n" +
                            "<h1 style=\"\n" +
                            "    font-family: sans-serif;\n" +
                            "    color: #33477b;\n" +
                            "    margin-top: 0;\n" +
                            "    font-size : 1.5rem;\n" +
                            "    margin-bottom: 0px;\n" +
                            "    font-stretch: extra-condensed;\n" +
                            "    position: relative;\n" +
                            "    top: -1rem;\n" +
                            "\">encuesta "+encuesta.getConsecutivo()+"</h1>"+
                            "\n" +
                            "<div style=\"/* max-height: 300px; */\">\n" +
                            "\n" +
                            "	\n" +
                            "<table class=\"egt\" style=\"margin: 0 auto;font-family: sans-serif;display: block;background: #e8ecff;color: #434550;border: 1px solid #efefef;text-align: left;/* border-radius: 7px; */border-collapse: collapse;width: 595px;height: 350px;box-shadow: inset 0px 0px 8px 0px #d6d6d6;overflow: overlay;\" border=\"1\">\n" +
                            "\n" +
                            "  <tbody><tr style=\"\n" +
                            "    background: #4f61a1;\n" +
                            "    color: white;\n" +
                            "    text-align: center;\n" +
                            "    /* border: 1px solid #b1b1b1; */\n" +
                            "\">\n" +
                            "\n" +
                            "    <th scope=\"row\" style=\"\n" +
                            "    width: 300px;\n" +
                            "\">Preguntas</th>\n" +
                            "\n" +
                            "    <th>Respuestas</th>\n" +
                            "\n" +
                            "    <th>responsable</th>\n" +
                            "\n" +
                            "  </tr>" +
                            "\n" +
                            setResultadosUser(resultados)
                           +
                            "</tbody></table>\n" +
                            "\n" +
                            "\n" +
                            "</div>\n" +
                            "\n" +
                            "<h2 style=\"\n" +
                                "    font-family: sans-serif;\n" +
                                "    font-weight: 800;\n" +
                                "    color: #3354dd;\n" +
                                "    margin-top: 2rem;\n" +
                                "    font-stretch: ultra-condensed;\n" +
                                "\">Fecha de realización</h2>\n" +
                                "<h3 style=\"\n" +
                                "    position: relative;\n" +
                                "    top: -1rem;\n" +
                                "    font-family: sans-serif;\n" +
                                "    color: #33477b;\n" +
                                "    font-stretch: condensed;\n" +
                                "\">"+format.format(encuesta.getFecha())+"</h3>\n" +
                                "\n" +
                                "<a onmouseover=\"this.style.background='#7289ea'; this.style.cursor='pointer'\" onmouseout=\"this.style.background='#334678'; this.style.cursor='default'\" style=\"text-decoration: none; background: rgb(51, 72, 130); color: white; padding: 15px; font-size: medium; border-radius: 4px; font-family: sans-serif; cursor: default;\" href=\""+ this.urlUser+encuesta.getId()+"\">Confirmar</a>\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "\n" +
                                "</body></html>", true);
                        javaMailSender.send(message);


        } 

        

        String html;
        private String setResultadosUser(List<ResultadoEncuestaDetalle> resultados){
                this.html = "";
                resultados.forEach((r) ->{ 
                    if(r.getIdResponsable() != null){
                               this.html +=  "  <tr style=\"\n" +
                            "    border: 1px solid #d9d9d9;\n" +
                            "    border-collapse: collapse;\n" +
                            "\">\n" +
                            "\n" +
                            "    <th style=\"\n" +
                            "    width: 400px;\n" +
                            "    /* width: 00px; */\n" +
                            "    font-size: small;\n" +
                            "\">"+r.getIdPregunta().getDescripcion()+"</th>\n" +
                            "\n" +
                            "    <td style=\"\n" +
                            "    text-align: center;\n" +
                            "\">"+
                            setPreguntas(r.getResultado())                            
                            +"</td>\n" +
                            "\n" +
                            "    <td style=\"\n" +
                            "    text-align: center;\n" +
                            "\">"+r.getIdResponsable().getNombre()+" "+r.getIdResponsable().getApellido()+"</td>\n" +
                            "\n" +
                            "\n" +
                            "  </tr>\n";
                    }
                     
            });
            return this.html;
        }
        
        
        
        
        private String setResultados(List<ResultadoEncuestaDetalle> resultados, Responsables responsable){
            this.html = "";
            resultados.forEach((r) ->{                          


                if(r.getIdResponsable() != null){
                    if(responsable.getId() == r.getIdResponsable().getId()){
                           this.html +=  "  <tr style=\"\n" +
                            "    border: 1px solid #d9d9d9;\n" +
                            "    border-collapse: collapse;\n" +
                            "\">\n" +
                            "\n" +
                            "    <th style=\"\n" +
                            "    width: 400px;\n" +
                            "    /* width: 00px; */\n" +
                            "    font-size: small;\n" +
                            "\">"+r.getIdPregunta().getDescripcion()+"</th>\n" +
                            "\n" +
                            "    <td style=\"\n" +
                            "    text-align: center;\n" +
                            "\">"+
                            setPreguntas(r.getResultado())                            
                            +"</td>\n" +
                            "\n" +
                            "    <td style=\"\n" +
                            "    text-align: center;\n" +
                            "\">"+r.getIdResponsable().getNombre()+" "+r.getIdResponsable().getApellido()+"</td>\n" +
                            "\n" +
                            "\n" +
                            "  </tr>\n"; 
                    }
                  
                }
            });
            return this.html;
        }


        private String setPreguntas(Short r){
            String respuesta = "";
            switch (r) {
                case 0:
                    respuesta = "Si";
                    break;
                case 1:
                    respuesta = "No";
                    break;        
                case 2:
                    respuesta = "Sin responder";
                    break;                            
            }
            return respuesta;
        }
        
        
        
        
        
        

        
     
        
   
    
}
