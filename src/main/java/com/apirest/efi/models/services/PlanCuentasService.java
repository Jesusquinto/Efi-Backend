package com.apirest.efi.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apirest.efi.models.entity.PlanCuentas;
import com.apirest.efi.models.dao.PlanCuentasDao;

@Service
public class PlanCuentasService {

    @Autowired
    private PlanCuentasDao planCuentasDao;
    
    public List<PlanCuentas> findAll(){
        return planCuentasDao.findAll();
    }

    public PlanCuentas findById(Integer id){
        return planCuentasDao.findById(id).orElse(null);
    }

    public PlanCuentas save(PlanCuentas planCuentas){
        return planCuentasDao.save(planCuentas);
    }

    public List<PlanCuentas> PlanCuentasFilter(String tipoPlan, String tipo, String entidad){
        return planCuentasDao.findByFilters(tipoPlan, tipo, entidad);
    }

    public List<String> findTiposPlan(){
        return planCuentasDao.findTiposPlan();
    }

    public List<String> findTipos(){
        return planCuentasDao.findTipos();
    }

    public List<String> findTiposEntidad(){
        return planCuentasDao.findTiposEntidad();
    }
}
