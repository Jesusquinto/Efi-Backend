package com.apirest.efi.controllers;

import java.util.List;

import com.apirest.efi.models.entity.PlanCuentas;
import com.apirest.efi.models.services.PlanCuentasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/efi/")
public class PlanCuentasController {


 
  @Autowired
  private PlanCuentasService planCuentasService;

  @GetMapping("planCuentas")
  public List<PlanCuentas> findAll() {
    return planCuentasService.findAll();
  }

  @GetMapping("planCuentas/{id}")
  public PlanCuentas findById(@PathVariable("id") Integer id) {
    return planCuentasService.findById(id);
  }

  @PostMapping("planCuentas")
  public PlanCuentas save(@RequestBody PlanCuentas planCuentas) {
    return planCuentasService.save(planCuentas);
  }

  @PutMapping("planCuentas")
  public PlanCuentas edit(@RequestBody PlanCuentas planCuentas) {
    PlanCuentas planCuentasActual = new PlanCuentas();
    PlanCuentas planCuentasUpdate = new PlanCuentas();
    planCuentasActual = planCuentasService.findById(planCuentas.getIdCuenta());

    if (planCuentasActual != null) {
      planCuentasUpdate = planCuentasService.save(planCuentas);
    }
    return planCuentasUpdate;
  }

  @PutMapping("planCuentas/estado")
  public PlanCuentas cambiarEstado(@RequestBody PlanCuentas planCuentas) {
    PlanCuentas planCuentasUpdate = null;
    PlanCuentas planCuentasActual = planCuentasService.findById(planCuentas.getIdCuenta());

    if (planCuentasActual != null) {
      if (planCuentas.getEstado() == 0) {
        planCuentas.setEstado(1);
      } else {
        planCuentas.setEstado(0);
      }
      planCuentasUpdate = planCuentasService.save(planCuentas);
    }
    return planCuentasUpdate;
  }



 @GetMapping("planCuentas/filter/{tipoPlan}/{tipo}/{entidad}")
  public List<PlanCuentas> findByfilter(@PathVariable("tipoPlan") String tipoPlan,@PathVariable("tipo") String tipo,@PathVariable("entidad") String entidad) {
    return planCuentasService.PlanCuentasFilter(tipoPlan, tipo, entidad);
  }


  @GetMapping("planCuentas/tiposCuentas")
  public List<String> findTipoCuentas() {
    return planCuentasService.findTiposPlan();
  }

  @GetMapping("planCuentas/tipos")
  public List<String> findTipos() {
    return planCuentasService.findTipos();
  }

  @GetMapping("planCuentas/entidades")
  public List<String> findEntidades() {
    return planCuentasService.findTiposEntidad();
  }



}
