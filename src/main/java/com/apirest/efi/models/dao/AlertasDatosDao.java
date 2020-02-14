/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.efi.models.dao;

import com.apirest.efi.models.entity.AlertasDatos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author RICARDO
 */
public interface AlertasDatosDao extends JpaRepository<AlertasDatos, Integer>{
    
              @Query(value="select *, (select entidad from entidades e where e.codigo_chip = a.codigo_chip)  as nombre  from alertas_datos a\n" +
            "where\n" +
            "a.codigo_chip in ( SELECT codigo_chip from Entidades WHERE Departamento in (SELECT departamento from entidades e where e.id_entidad = :idEntidad) )\n" +
            "and periodo_anno = :anno and periodo_mes = :periodo\n" +
            "order by nombre asc",nativeQuery = true)
          List<Object> getDatosAlertas(@Param("idEntidad") Long idEntidad, @Param("periodo") String periodo, @Param("anno") String anno );
        
    
    
    @Query("SELECT a FROM AlertasDatos a WHERE a.codigoChip = :codigo_chip and a.periodoAnno = :anno and a.periodoMes = :mes")
    AlertasDatos findAlertasByEntidadAnnoMes(@Param("codigo_chip") String codigo_chip,@Param("anno") String anno, @Param("mes") String mes );
}
