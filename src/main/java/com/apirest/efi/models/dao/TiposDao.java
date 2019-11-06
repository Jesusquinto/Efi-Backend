/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.efi.models.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.apirest.efi.models.entity.IndicadorTipo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author RICARDO
 */
public interface TiposDao extends JpaRepository<IndicadorTipo, Integer> {
    
    @Query("SELECT i FROM IndicadorTipo i where i.estado = 1")
    List<IndicadorTipo> findTiposActivos();
    
}
