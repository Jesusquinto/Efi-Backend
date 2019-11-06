/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.efi.models.dao;

import java.util.List;

import com.apirest.efi.models.entity.AlertasReportes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author RICARDO
 */
public interface AlertasReportesDao extends JpaRepository<AlertasReportes, Integer>{
    @Query(value="SELECT id " +
"      , entidades.entidad " +
"      , alertas_reportes.codigo_chip " +
"      ,codigo_chip_reporte " +
"      ,periodo_anno " +
"      ,periodo_meses " +
"      ,alertas_reportes.estado " +
"      ,(select reportes_chip.nombre from reportes_chip where reportes_chip.codigo_chip_reporte =  alertas_reportes.codigo_chip_reporte) AS descripcionChip " +       
"  FROM alertas_reportes, entidades " +
"  where alertas_reportes.codigo_chip = entidades.codigo_chip " +
"        and alertas_reportes.codigo_chip =:codigo_chip  " +
"		and periodo_anno = :anno  " +
"		and periodo_meses =:mes  ",
            nativeQuery = true)
    List<Object> findAlertasByEntidadAnnoMes(@Param("codigo_chip") Integer codigo_chip,@Param("anno") String anno, @Param("mes") String mes );
}
