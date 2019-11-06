package com.apirest.efi.models.services;

import java.util.List;

import com.apirest.efi.models.dao.ResponsablesDao;
import com.apirest.efi.models.entity.Responsables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponsablesService {

    @Autowired
    private ResponsablesDao responsablesDao;
    
    public List<Responsables> findAll(){
        return responsablesDao.findAll();
    }

    public Responsables findById(Long  id){
        return responsablesDao.findById(id).orElse(null);
    }

    public Responsables save(Responsables responsables){
        return responsablesDao.save(responsables);
    }

    public List<Responsables> listByIdEmpresa(Long idEmpresa, Long idResultadoEncuesta){
        return responsablesDao.findResponsablesByIdEmpresa(idEmpresa, idResultadoEncuesta);
    }


    public List<Responsables> listResponsables(Long idResultadoEncuesta){
        return responsablesDao.findResponsables(idResultadoEncuesta);
    }
    
 
}