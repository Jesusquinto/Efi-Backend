package com.apirest.efi.models.dao;

import java.util.List;

import com.apirest.efi.models.entity.Calendario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CalendarioDao extends JpaRepository<Calendario, Integer> {

    
    @Query(value="Select distinct periodo from calendario WHERE activo = 1",nativeQuery = true)
    List<String> findAnnos();
    
    
    @Query(value="SELECT distinct codigo_chip, descripcion_chip FROM calendario WHERE activo = 1",nativeQuery = true)
    List<Object> findPeriodos();
}