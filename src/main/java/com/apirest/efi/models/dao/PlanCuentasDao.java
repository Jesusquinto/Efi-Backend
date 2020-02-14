package com.apirest.efi.models.dao;

import java.util.List;

import com.apirest.efi.models.entity.PlanCuentas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface PlanCuentasDao extends JpaRepository<PlanCuentas, Integer> {

    @Query("select p from PlanCuentas p where p.tipoPlan = :tipoPlan and tipo = :tipo and entidad = :entidad")
    List<PlanCuentas> findByFilters(@Param("tipoPlan") String tipoPlan, @Param("tipo") String tipo, @Param("entidad") String entidad );

    @Query(value="select distinct tipo_plan from plan_cuentas",nativeQuery = true)
    List<String> findTiposPlan();

    @Query(value="select distinct tipo from plan_cuentas",nativeQuery = true)
    List<String> findTipos();


    @Query(value="select distinct entidad from plan_cuentas",nativeQuery = true)
    List<String> findTiposEntidad();
}