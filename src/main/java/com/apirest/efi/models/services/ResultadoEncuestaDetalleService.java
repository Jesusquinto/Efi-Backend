package com.apirest.efi.models.services;

import java.util.List;

import com.apirest.efi.models.dao.ResultadoEncuestaDetalleDao;
import com.apirest.efi.models.entity.Responsables;
import com.apirest.efi.models.entity.ResultadoEncuestaDetalle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultadoEncuestaDetalleService {

    @Autowired
    private ResultadoEncuestaDetalleDao resultadoEncuestaDetalleDao;
    
    public List<ResultadoEncuestaDetalle> findAll(){
        return resultadoEncuestaDetalleDao.findAll();
    }

    public ResultadoEncuestaDetalle findById(Long id){
        return resultadoEncuestaDetalleDao.findById(id).orElse(null);
    }

    public ResultadoEncuestaDetalle save(ResultadoEncuestaDetalle resultadoEncuestaDetalle){
        return resultadoEncuestaDetalleDao.save(resultadoEncuestaDetalle);
    }
    
    public List<ResultadoEncuestaDetalle> findByResultadoEncuesta(Long idResultadoEncuesta){
        return resultadoEncuestaDetalleDao.findByResultadoEncuesta(idResultadoEncuesta);
    }
    
    public void deletePreguntasByEncuesta(Long idResultadoEncuesta){
       
       resultadoEncuestaDetalleDao.deletePreguntas(idResultadoEncuesta);
    }       

    public List<Responsables> getResponsables(Long idResultadoEncuesta){
        return resultadoEncuestaDetalleDao.getResponsables(idResultadoEncuesta);
    }
    
    public List<ResultadoEncuestaDetalle> findByIdEncuestaAndIdResponsable(Long idEncuesta, Long idResponsable){
        return resultadoEncuestaDetalleDao.findByIdEncuestaAndIdResponsable(idEncuesta, idResponsable);
    }

    public List<ResultadoEncuestaDetalle> findByIdResponsable(Long idResponsable){
        return resultadoEncuestaDetalleDao.findByIdResponsables(idResponsable);
    }
   
}