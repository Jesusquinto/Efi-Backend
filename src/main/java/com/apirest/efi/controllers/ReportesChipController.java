package com.apirest.efi.controllers;
import java.util.List;

import com.apirest.efi.models.entity.ReportesChip;
import com.apirest.efi.models.services.ReportesChipService;

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
public class ReportesChipController {

    @Autowired
    private ReportesChipService reportesChipService;
    @GetMapping("reporteschip")
  public List<ReportesChip> findAll() {
    return reportesChipService.findAll();
  }

  @GetMapping("reporteschip/{id}")
  public ReportesChip findById(@PathVariable("id") Integer id) {
    return reportesChipService.findById(id);
  }

  @PostMapping("reporteschip")
  public ReportesChip save(@RequestBody ReportesChip reportesChip) {
    return reportesChipService.save(reportesChip);
  }

  @PutMapping("reporteschip")
  public ReportesChip edit(@RequestBody ReportesChip reportesChip) {
    ReportesChip reportesChipActual = new ReportesChip();
    ReportesChip reportesChipUpdate = new ReportesChip();
    reportesChipActual = reportesChipService.findById(reportesChip.getIdReporte());

    if (reportesChipActual != null) {
        reportesChipUpdate = reportesChipService.save(reportesChip);
    }
    return reportesChipUpdate;
  }

  @PutMapping("reporteschip/estado")
  public ReportesChip cambiarEstado(@RequestBody ReportesChip reportesChip) {
    ReportesChip reportesChipUpdate = null;
    ReportesChip reportesChipActual = reportesChipService.findById(reportesChip.getIdReporte());

    if (reportesChipActual != null) {
      if (reportesChip.getEstado() == 1) {
        reportesChip.setEstado(0);
      } else {
        reportesChip.setEstado(1);
      }
      reportesChipUpdate = reportesChipService.save(reportesChip);
    }
    return reportesChipUpdate;
  }

}
