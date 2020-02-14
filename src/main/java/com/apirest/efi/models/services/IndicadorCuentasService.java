package com.apirest.efi.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.efi.models.entity.IndicadorCuentas;
import com.apirest.efi.models.dao.IndicadorCuentasDao;


import java.util.List;

@Service
public class IndicadorCuentasService {

    @Autowired
    private IndicadorCuentasDao indicadorCuentasDao;
    
    public List<IndicadorCuentas> findAll(){
        return indicadorCuentasDao.findAll();
    }

    public IndicadorCuentas findById(Long id){
        return indicadorCuentasDao.findById(id).orElse(null);
    }

    public IndicadorCuentas save(IndicadorCuentas indicadorCuentas){
        return indicadorCuentasDao.save(indicadorCuentas);
    }
    
    public IndicadorCuentas getByIdVariable(Integer idVariable){
           return indicadorCuentasDao.getByIdVariable(idVariable);
    }





}