package com.apirest.efi.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.efi.models.entity.Historicos;
import com.apirest.efi.models.dao.HistoricosDao;


import java.util.List;

@Service
public class HistoricosService {

    @Autowired
    private HistoricosDao historicosDao;
    
    public List<Historicos> findAll(){
        return historicosDao.findAll();
    }

    public Historicos findById(Long id){
        return historicosDao.findById(id).orElse(null);
    }

    public Historicos save(Historicos historico){
        return historicosDao.save(historico);
    }
    
    public List<Object> getHistoricosByData(String ano, String periodo, String cuenta, Long idEntidad){
        return historicosDao.getByAnnoPeriodoCuentaIdEntidad(ano, periodo, cuenta, idEntidad);
    }
    
    public List<Object> getHistoricosByPeriodoAndMunicipio(String codigoChip,String cuenta, String periodo){
        return historicosDao.getByPeriodoAndMunicipio(codigoChip, cuenta, periodo);
    }




}