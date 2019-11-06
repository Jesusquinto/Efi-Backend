/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.efi.controllers;

import java.util.ArrayList;
import java.util.List;

import com.apirest.efi.models.entity.AlertasDatos;
import com.apirest.efi.models.entity.DatosIndicadores;
import com.apirest.efi.models.entity.Entidades;
import com.apirest.efi.models.entity.IndicadorGrupo;
import com.apirest.efi.models.entity.IndicadorTipo;
import com.apirest.efi.models.entity.IndicadorVariables;
import com.apirest.efi.models.services.CalendarioService;
import com.apirest.efi.models.services.DataService;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jesus
 */

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/efi/")
public class DataController {

  @Autowired
  private DataService dataService;



  @GetMapping("tipos")
  public List<IndicadorTipo> findAll() {
    return dataService.listarTiposIndicador();
  }

  @GetMapping("grupos/indicador/{idIndicador}")
  public List<IndicadorGrupo> listarGruposByTipoIndicador(@PathVariable("idIndicador") Integer idIndicador) {
    return dataService.listarGruposByTipoIndicador(idIndicador);
  }

  @GetMapping("indicadores/tipo/grupo/{idTipo}/{idGrupo}")
  public List<IndicadorVariables> listarIndicadoresByGrupoAndTipo(@PathVariable("idTipo") Integer idTipo,
      @PathVariable("idGrupo") Integer idGrupo) {
    return dataService.listarIndicadoresByGrupoAndTipo(idGrupo, idTipo);
  }

  @GetMapping("list/departamentos")
  public List<Entidades> listarGruposByTipoIndicador() {
    return dataService.listarDepartamentos();
  }

  @GetMapping("list/periodos")
  public List<String> listarPeriodos() {
    return dataService.listarPeriodos();
  }

  @GetMapping("list/municipios/departamento/{idDepartamento}")
  public List<Entidades> listarMunicipios(@PathVariable("idDepartamento") Integer idDepartamento) {
    return dataService.listarMunicipios(idDepartamento);
  }

  @GetMapping("indicadores/departamento/grupo/periodo/indicador/{codigoDepartamento}/{idGrupo}/{periodo}/{idIndicador}")
  public List<DatosIndicadores> listarPeriodos(@PathVariable("codigoDepartamento") String codigoDepartamento,
      @PathVariable("idGrupo") Integer idGrupo, @PathVariable("periodo") Integer periodo,
      @PathVariable("idIndicador") Integer idIndicador) {
    return dataService.listarDatosByDepartamentoGrupoPeriodoIndicador(codigoDepartamento, idGrupo, periodo,
        idIndicador);
  }

  @GetMapping("indicadores/municipio/grupo/periodo/{codigoMunicipio}/{idGrupo}/{periodo}")
  public List<DatosIndicadores> listarIndicadoresMunicipio(@PathVariable("codigoMunicipio") String codigoMunicipio,
      @PathVariable("idGrupo") Integer idGrupo, @PathVariable("periodo") Integer periodo) {
    return dataService.listarDatosByMunicipioGrupoPeriodo(codigoMunicipio, idGrupo, periodo);
  }

  @GetMapping("indicadores/municipio/grupo/indicador/{codigoMunicipio}/{idGrupo}/{idIndicador}")
  public List<DatosIndicadores> listarIndicadoresMunicipioByIndicadorTipo(
      @PathVariable("codigoMunicipio") String codigoMunicipio, @PathVariable("idGrupo") Integer idGrupo,
      @PathVariable("idIndicador") Integer idIndicador) {

    return dataService.listarDatosByMunicipio_grupo_indicador(codigoMunicipio, idGrupo, idIndicador);
  }

  @PostMapping("alertas/codigochip/ano/mes/{codigoChip}/{ano}/{mes}")
  public List<Object> findAlertasByEntidadAnnoMes(@PathVariable("codigoChip") Integer codigoChip,
      @PathVariable("ano") String ano, @PathVariable("mes") String mes, @RequestBody List<Entidades> municipios) {

    List<Object> alertas = new ArrayList<Object>();
    for (int i = 0; i < municipios.size(); i++) {
      alertas.add(dataService.findAlertasByEntidadAnnoMes(municipios.get(i).getCodigoChip(), ano, mes));
    }

    return alertas;
  }

  @GetMapping("alertasdatos/codigochip/ano/mes/{codigoChip}/{ano}/{mes}")
  public AlertasDatos findAlertasDatos(@PathVariable("codigoChip") String codigoChip, @PathVariable("ano") String ano,
      @PathVariable("mes") String mes) {

    return dataService.findAlertasDatos(codigoChip, ano, mes);
  }

  /*
   * @GetMapping("calendario/periodos") public List<Calendario>
   * listarPeriodosCalendario(){ return calendarioService.findAll(); }
   * 
   * 
   * @GetMapping("calendario/anos") public List<String> listarAnnosCalendario(){
   * return dataService.findAnnos(); }
   */

}
