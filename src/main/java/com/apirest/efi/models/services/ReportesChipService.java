package com.apirest.efi.models.services;

import java.util.List;

import com.apirest.efi.models.dao.ReportesChipDao;
import com.apirest.efi.models.entity.ReportesChip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportesChipService {

    @Autowired
    private ReportesChipDao reportesChipDao;


    public ReportesChip save(Long codigoChipReporte){
        return reportesChipDao.findByCodigoChipReporte(codigoChipReporte);
    }

    public List<ReportesChip> findAll(){
        return reportesChipDao.findAll();
    }

    public ReportesChip findById(Integer id){
        return reportesChipDao.findById(id).orElse(null);
    }

    public List<ReportesChip> findByEstado(Integer estado){
        return reportesChipDao.findByEstado(estado);
    }

    public ReportesChip save(ReportesChip reportesChip){
        return reportesChipDao.save(reportesChip);
    }

 
    
 
}