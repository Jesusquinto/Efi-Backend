package com.apirest.efi.models.dao;

import java.util.List;

import com.apirest.efi.models.entity.Responsables;
import com.apirest.efi.models.entity.ResultadoEncuestaDetalle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ResultadoEncuestaDetalleDao extends JpaRepository<ResultadoEncuestaDetalle, Long> {
    
     @Query("SELECT r FROM ResultadoEncuestaDetalle r WHERE (r.idResultadoEncuesta.id = :idResultadoEncuesta) AND (r.estado = 0)")
     public List<ResultadoEncuestaDetalle> findByResultadoEncuesta(@Param("idResultadoEncuesta") Long idResultadoEncuesta);
     
     @Query("SELECT r FROM ResultadoEncuestaDetalle r WHERE (r.idResultadoEncuesta.id = :idResultadoEncuesta) AND (r.idResponsable.id = :idResponsable) AND (r.estado = 0)")
     public List<ResultadoEncuestaDetalle> findByIdEncuestaAndIdResponsable(@Param("idResultadoEncuesta") Long idResultadoEncuesta, @Param("idResponsable") Long idResponsable);
          
     @Transactional
     @Modifying
     @Query("UPDATE ResultadoEncuestaDetalle r SET r.estado = 1 WHERE  r.idResultadoEncuesta.id = :idResultadoEncuesta")
     public void deletePreguntas(@Param("idResultadoEncuesta") Long idResultadoEncuesta);


     @Query("SELECT DISTINCT(r.idResponsable) FROM ResultadoEncuestaDetalle r  where r.idResultadoEncuesta.id = :idResultadoEncuesta and r.idResponsable.id is not null")
     public List<Responsables> getResponsables(@Param("idResultadoEncuesta") Long idResultadoEncuesta);


     @Query("SELECT r FROM ResultadoEncuestaDetalle r where r.idResponsable.id = :idResponsable")
     public List<ResultadoEncuestaDetalle> findByIdResponsables(@Param("idResponsable") Long idResponsable);
}