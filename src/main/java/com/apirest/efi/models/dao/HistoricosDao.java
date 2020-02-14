package com.apirest.efi.models.dao;

import com.apirest.efi.models.entity.Historicos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface HistoricosDao extends JpaRepository<Historicos, Long> {

  @Query(value="select *, [dbo].[verNombreEntidad](codigo_fut) as nombreEntidad, (select r.keys from reportes_chip r where r.codigo_chip_reporte = reporte) as jkeys from historicos where anno = :anno and periodo = :periodo and cuenta = :cuenta and codigo_fut in (\n" +
"    SELECT codigo_chip from Entidades WHERE Departamento in (SELECT departamento from entidades e where e.id_entidad = :idEntidad)\n" +
"    )\n" +
"order by nombreEntidad", nativeQuery=true)
  public List<Object> getByAnnoPeriodoCuentaIdEntidad(@Param("anno") String anno,@Param("periodo") String periodo, @Param("cuenta") String cuenta, @Param("idEntidad") Long idEntidad );
    
  
   @Query(value="select *, [dbo].[verNombreEntidad](codigo_fut) as nombreEntidad, (select r.keys from reportes_chip r where r.codigo_chip_reporte = reporte) as jkeys from historicos where codigo_fut = :codigoChip and cuenta = :cuenta and periodo = :periodo", nativeQuery = true)
   public List<Object> getByPeriodoAndMunicipio(@Param("codigoChip") String codigoChip ,@Param("cuenta") String cuenta, @Param("periodo") String periodo );
  
}