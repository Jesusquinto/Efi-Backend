/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.efi.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 * @author jesus
 */
@Entity
@Table(name = "indicador_tipo")
public class IndicadorTipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tipo_indicador")
    private Integer idTipoIndicador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre_tipo")
    private String nombreTipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fk_empresa")
    private int fkEmpresa;
    @Size(max = 2)
    @Column(name = "tipo")
    private String tipo;

    public IndicadorTipo() {
    }

    public IndicadorTipo(Integer idTipoIndicador) {
        this.idTipoIndicador = idTipoIndicador;
    }

    public IndicadorTipo(Integer idTipoIndicador, String nombreTipo, int estado, int fkEmpresa) {
        this.idTipoIndicador = idTipoIndicador;
        this.nombreTipo = nombreTipo;
        this.estado = estado;
        this.fkEmpresa = fkEmpresa;
    }

    public Integer getIdTipoIndicador() {
        return idTipoIndicador;
    }

    public void setIdTipoIndicador(Integer idTipoIndicador) {
        this.idTipoIndicador = idTipoIndicador;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getFkEmpresa() {
        return fkEmpresa;
    }

    public void setFkEmpresa(int fkEmpresa) {
        this.fkEmpresa = fkEmpresa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoIndicador != null ? idTipoIndicador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndicadorTipo)) {
            return false;
        }
        IndicadorTipo other = (IndicadorTipo) object;
        if ((this.idTipoIndicador == null && other.idTipoIndicador != null) || (this.idTipoIndicador != null && !this.idTipoIndicador.equals(other.idTipoIndicador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apirest.efi.models.entity.IndicadorTipo[ idTipoIndicador=" + idTipoIndicador + " ]";
    }
    
}
