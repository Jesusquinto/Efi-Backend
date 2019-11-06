/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.efi.models.dao;

import java.util.List;

import com.apirest.efi.models.entity.ReportesChip;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author RICARDO
 */
public interface ReportesChipDao extends JpaRepository<ReportesChip, Integer>{
    @Query("SELECT r FROM ReportesChip r WHERE r.estado = 1")
    List<ReportesChip> findReportesActivos();


    @Query("SELECT r FROM ReportesChip r WHERE r.codigoChipReporte = :codigoChipReporte")
    ReportesChip findByCodigoChipReporte(@Param("codigoChipReporte") Long codigoChipReporte);

    @Query("SELECT r FROM ReportesChip r WHERE r.estado = :estado")
    List<ReportesChip> findByEstado(@Param("estado") Integer estado);
}
