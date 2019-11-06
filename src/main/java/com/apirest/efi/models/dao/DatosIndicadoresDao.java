/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.efi.models.dao;

import com.apirest.efi.models.entity.DatosIndicadores;
import com.apirest.efi.models.entity.DatosIndicadoresPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jesus
 */
public interface DatosIndicadoresDao extends JpaRepository<DatosIndicadores, DatosIndicadoresPK> {
    
}
