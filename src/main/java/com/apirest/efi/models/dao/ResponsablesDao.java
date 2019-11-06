package com.apirest.efi.models.dao;

import java.util.List;

import com.apirest.efi.models.entity.Responsables;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ResponsablesDao extends JpaRepository<Responsables, Long> {

    
    @Query(value = "SELECT * FROM responsables  WHERE id_empresa = :idEmpresa and resultado_encuesta = :idResultadoEncuesta ", nativeQuery = true) 
    public List<Responsables> findResponsablesByIdEmpresa(@Param("idEmpresa") Long idEmpresa, @Param("idResultadoEncuesta") Long idResultadoEncuesta);


    @Query(value = "SELECT * FROM responsables  WHERE resultado_encuesta = :idResultadoEncuesta and EXISTS (SELECT id_responsable as id FROM resultado_encuesta_detalle where resultado_encuesta_detalle.id_responsable = responsables.id and id_resultado_encuesta = :idResultadoEncuesta  )", nativeQuery = true) 
    public List<Responsables> findResponsables( @Param("idResultadoEncuesta") Long idResultadoEncuesta);
    
 
}