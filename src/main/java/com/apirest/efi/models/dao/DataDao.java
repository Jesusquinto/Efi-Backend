/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.efi.models.dao;

import com.apirest.efi.models.entity.DatosIndicadores;
import com.apirest.efi.models.entity.DatosIndicadoresPK;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface DataDao extends JpaRepository<DatosIndicadores, DatosIndicadoresPK> {
    @Query("SELECT d FROM DatosIndicadores d WHERE d.fkGrupo = :id_grupo and d.datosIndicadoresPK.periodo = :periodo and d.datosIndicadoresPK.tipo = :tipo and (d.codigoDepartamento = :codigo_departamento) ORDER BY  d.valor asc")
    List<DatosIndicadores> findByDep_grupo_periodo_indicador(@Param("codigo_departamento") String codigo_departamento, @Param("id_grupo") Integer id_grupo, @Param("periodo") Integer periodo, @Param("tipo") Integer tipo );
    
    
    @Query("SELECT d FROM DatosIndicadores d WHERE d.fkGrupo = :id_grupo and d.datosIndicadoresPK.periodo = :periodo and  (d.datosIndicadoresPK.municipio = :municipio) ORDER BY d.datosIndicadoresPK.tipo desc")
    List<DatosIndicadores> findByMunicipio_grupo_periodo(@Param("municipio") String municipio, @Param("id_grupo") Integer id_grupo, @Param("periodo") Integer periodo );
    
    
    @Query("SELECT d FROM DatosIndicadores d WHERE d.fkGrupo = :id_grupo and d.datosIndicadoresPK.tipo = :tipo and d.datosIndicadoresPK.municipio = :municipio")
    List<DatosIndicadores> findByMunicipio_grupo_indicador(@Param("municipio") String municipio, @Param("id_grupo") Integer id_grupo, @Param("tipo") Integer tipo );
    
    
    @Query(value="Select distinct periodo from datos_indicadores order by 1 desc", nativeQuery = true)
    List<String> findPeriodos();
    
    
    
    
    }
