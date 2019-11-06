/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.efi.models.dao;

import com.apirest.efi.models.entity.AlertasDatos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author RICARDO
 */
public interface AlertasDatosDao extends JpaRepository<AlertasDatos, Integer>{
    @Query("SELECT a FROM AlertasDatos a WHERE a.codigoChip = :codigo_chip and a.periodoAnno = :anno and a.periodoMes = :mes")
    AlertasDatos findAlertasByEntidadAnnoMes(@Param("codigo_chip") String codigo_chip,@Param("anno") String anno, @Param("mes") String mes );
}
