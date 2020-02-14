package com.apirest.efi.models.dao;

import com.apirest.efi.models.entity.Entidades;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EntidadesDao extends JpaRepository<Entidades, Long> {

        @Query(value = "SELECT * from entidades\n" +
        "WHERE Departamento in (SELECT departamento from entidades e where e.id_entidad = :idEntidad)\n" +
        "ORDER BY id_entidad;", nativeQuery = true)
        public List<Entidades> filterByEmpresa(@Param("idEntidad") Long idEntidad);

        
          @Query("SELECT e from Entidades e  where e.tipo ='G' and e.estado = 1  ORDER BY e.codigoDane")
          List<Entidades> findDepartamentos();
          
          

    
    
    
    
    /**
     *
     * @param id_Entidad Departamento Seleccionado, o traido del Select.
     * @return Lista de Entidades del mismo departamento de la Entidad Dada.
     */
    @Query(value = "SELECT * from Entidades WHERE Departamento in (SELECT departamento from entidades e where e.id_entidad = :id_Entidad) ORDER BY id_entidad",
                    nativeQuery = true ) 
   List<Entidades> findEntidadesByDepartamentoByIdEntidad(@Param("id_Entidad") Integer id_Entidad);
    
}