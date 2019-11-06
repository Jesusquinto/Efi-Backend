/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.efi.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Embeddable
public class DatosIndicadoresPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "periodo")
    private int periodo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo")
    private int tipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "municipio")
    private String municipio;

    public DatosIndicadoresPK() {
    }

    public DatosIndicadoresPK(int periodo, int tipo, String municipio) {
        this.periodo = periodo;
        this.tipo = tipo;
        this.municipio = municipio;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) periodo;
        hash += (int) tipo;
        hash += (municipio != null ? municipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosIndicadoresPK)) {
            return false;
        }
        DatosIndicadoresPK other = (DatosIndicadoresPK) object;
        if (this.periodo != other.periodo) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        if ((this.municipio == null && other.municipio != null) || (this.municipio != null && !this.municipio.equals(other.municipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "efidev.co.modelo.DatosIndicadoresPK[ periodo=" + periodo + ", tipo=" + tipo + ", municipio=" + municipio + " ]";
    }
    
}
