package com.apirest.efi.controllers;

import com.apirest.efi.models.entity.Historicos;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.apirest.efi.models.entity.IndicadorCuentas;
import com.apirest.efi.models.services.HistoricosService;
import com.apirest.efi.models.services.IndicadorCuentasService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/efi/")
public class IndicadorCuentasController {

    @Autowired
    private IndicadorCuentasService indicadorCuentasService;
    
    @Autowired
    private HistoricosService historicosService;

    @GetMapping("indicadorcuentas")
    public List<IndicadorCuentas> findAll() {
		return indicadorCuentasService.findAll();
    }
    
    @GetMapping("indicadorcuentas/{id}")
    public IndicadorCuentas findById(@PathVariable("id") Long id) {
		return indicadorCuentasService.findById(id);
    }
    
    @PostMapping("indicadorcuentas")
    public IndicadorCuentas save(@RequestBody IndicadorCuentas indicadorCuentas) {
		return indicadorCuentasService.save(indicadorCuentas);
    }
    
    @PutMapping("indicadorcuentas")
    public IndicadorCuentas edit(@RequestBody IndicadorCuentas indicadorCuentas) {
        IndicadorCuentas indicadorActual = new IndicadorCuentas();
        IndicadorCuentas indicadorUpdate = new IndicadorCuentas();
        indicadorActual = indicadorCuentasService.findById(indicadorCuentas.getId());

        if (indicadorActual != null) {
            indicadorUpdate = indicadorCuentasService.save(indicadorCuentas);
        }
        return indicadorUpdate;
	}
    
    
    @GetMapping("indicadorcuentas/historicos/{idVariable}/{codigoChip}/{idEntidad}/{anno}/{periodo}")
    public List<Object> getHistoricosByIndicadorCuentasAndData(@PathVariable("idVariable") Integer idVariable,
                                                                   @PathVariable("codigoChip") String codigoChip,
                                                                   @PathVariable("idEntidad") Long idEntidad,
                                                                   @PathVariable("anno") String anno,
                                                                   @PathVariable("periodo") String periodo){
      IndicadorCuentas indicadorCuentas = this.indicadorCuentasService.getByIdVariable(idVariable);
      if(indicadorCuentas == null){
          return null;
      }
     return  this.historicosService.getHistoricosByData(anno, periodo, indicadorCuentas.getIdCuenta().getCodigo(), idEntidad);        
    }
    
    @GetMapping("indicadorcuentas/historicos/{idVariable}/{codigoChip}/{periodo}")
    public List<Object> getHistoricosByPeridoAndMunicipio(@PathVariable("idVariable") Integer idVariable,
                                                                   @PathVariable("codigoChip") String codigoChip,
                                                                   @PathVariable("periodo") String periodo){
        IndicadorCuentas indicadorCuentas = this.indicadorCuentasService.getByIdVariable(idVariable);        
        if(indicadorCuentas == null){
            return null;
        }
        return this.historicosService.getHistoricosByPeriodoAndMunicipio(codigoChip, indicadorCuentas.getIdCuenta().getCodigo() , periodo);               
    }
  
    
    
    
    
    
    
}
