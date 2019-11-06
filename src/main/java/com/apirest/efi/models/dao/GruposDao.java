
package com.apirest.efi.models.dao;



import com.apirest.efi.models.entity.IndicadorGrupo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface GruposDao extends JpaRepository<IndicadorGrupo, Integer>{
    
    
    @Query("SELECT i FROM IndicadorGrupo i WHERE i.fkTipo.idTipoIndicador = :idTipo and i.estado = 0")
    List<IndicadorGrupo> findByTipo(@Param("idTipo") Integer idTipo);
    
}
