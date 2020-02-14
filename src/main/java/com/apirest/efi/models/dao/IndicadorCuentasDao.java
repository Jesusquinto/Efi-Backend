package com.apirest.efi.models.dao;

import com.apirest.efi.models.entity.IndicadorCuentas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface IndicadorCuentasDao extends JpaRepository<IndicadorCuentas, Long> {

     @Query("SELECT i from IndicadorCuentas i where i.idVariable.idVariable = :idVariable")
     public IndicadorCuentas getByIdVariable(@Param("idVariable") Integer idVariable);
    
}