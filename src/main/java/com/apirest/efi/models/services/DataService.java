
package com.apirest.efi.models.services;



import java.util.List;

import com.apirest.efi.models.dao.AlertasDatosDao;
import com.apirest.efi.models.dao.AlertasReportesDao;
import com.apirest.efi.models.dao.CalendarioDao;
import com.apirest.efi.models.dao.DataDao;
import com.apirest.efi.models.dao.EntidadesDao;
import com.apirest.efi.models.dao.GruposDao;
import com.apirest.efi.models.dao.IndicadorVariablesDao;
import com.apirest.efi.models.dao.ReportesChipDao;
import com.apirest.efi.models.dao.TiposDao;
import com.apirest.efi.models.entity.AlertasDatos;
import com.apirest.efi.models.entity.DatosIndicadores;
import com.apirest.efi.models.entity.Entidades;
import com.apirest.efi.models.entity.IndicadorGrupo;
import com.apirest.efi.models.entity.IndicadorTipo;
import com.apirest.efi.models.entity.IndicadorVariables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DataService {
    @Autowired
    EntidadesDao entidadesRepository;
    
    @Autowired
    GruposDao gruposRepository;
    
    @Autowired
    TiposDao tiposRepository;
    
    @Autowired
    IndicadorVariablesDao indicadorVariablesRepository;
    
    @Autowired
    DataDao dataRepository;
    
     @Autowired
    AlertasReportesDao alertasReportesDao;
    
    @Autowired
    CalendarioDao calendarioDao;
    
    @Autowired
    ReportesChipDao reportesChipDao;

    @Autowired
    AlertasDatosDao alertasDatosDao;
    
    @Autowired
    private DataService dataService;
    
    
    public List<String> listarPeriodos(){
        return dataRepository.findPeriodos();
    }
    
    public List<Entidades> listarDepartamentos(){
        return entidadesRepository.findDepartamentos();
     }
    
    public List<Entidades> listarMunicipios(Integer id_departamento){
        return entidadesRepository.findEntidadesByDepartamentoByIdEntidad(id_departamento);
    }
    
    public List<IndicadorTipo> listarTiposIndicador(){
        return tiposRepository.findTiposActivos();
    }
    
    public List<IndicadorGrupo> listarGruposByTipoIndicador(Integer id_tipo){
        return gruposRepository.findByTipo(id_tipo);
    }
    
    public List<IndicadorVariables> listarIndicadoresByGrupoAndTipo(Integer id_grupo, Integer id_tipo){
        return indicadorVariablesRepository.findVariablesByGrupoAndTipo(id_grupo, id_grupo);
    }
    
    //Datos
    
    public List<DatosIndicadores> listarDatosByDepartamentoGrupoPeriodoIndicador(String departamento,Integer id_grupo, Integer periodo, Integer id_tipo){
        return dataRepository.findByDep_grupo_periodo_indicador(departamento, id_grupo, periodo, id_tipo);
    }
    
   
    public List<DatosIndicadores> listarDatosByMunicipioGrupoPeriodo(String municipio,Integer id_grupo, Integer periodo){
        return dataRepository.findByMunicipio_grupo_periodo(municipio, id_grupo, periodo);
    }
    
    public List<DatosIndicadores> listarDatosByMunicipio_grupo_indicador(String municipio,Integer id_grupo, Integer id_tipo){
        return dataRepository.findByMunicipio_grupo_indicador(municipio, id_grupo, id_tipo);
    }
    
   
    
    public List<Object> findAlertasByEntidadAnnoMes(Integer codigo_chip, String anno, String mes){
        return alertasReportesDao.findAlertasByEntidadAnnoMes(codigo_chip, anno, mes);
    }

    public AlertasDatos findAlertasDatos(String codigo_chip, String anno, String mes){
        return alertasDatosDao.findAlertasByEntidadAnnoMes(codigo_chip, anno, mes);
    }
    
  
    
}
