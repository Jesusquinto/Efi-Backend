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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "indicador_variables")
public class IndicadorVariables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)    
    @Column(name = "id_variable")
    private Integer idVariable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_variable")
    private String nombreVariable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fk_empresa")
    private int fkEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @Column(name = "codigo_fut")
    private Integer codigoFut;
    @Column(name = "orden")
    private Integer orden;
    @JoinColumn(name = "fk_grupo", referencedColumnName = "id_grupo")
    @ManyToOne(optional = false)
    private IndicadorGrupo fkGrupo;
    @Column (name = "css")
    private String css;
    

    public IndicadorVariables() {
    }

    public IndicadorVariables(Integer idVariable) {
        this.idVariable = idVariable;
    }

    public IndicadorVariables(Integer idVariable, String nombreVariable, int fkEmpresa, int estado, String css) {
        this.idVariable = idVariable;
        this.nombreVariable = nombreVariable;
        this.fkEmpresa = fkEmpresa;
        this.estado = estado;
        this.css = css;
    }

    public Integer getIdVariable() {
        return idVariable;
    }

    public void setIdVariable(Integer idVariable) {
        this.idVariable = idVariable;
    }

    public String getNombreVariable() {
        return nombreVariable;
    }

    public void setNombreVariable(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }

    public int getFkEmpresa() {
        return fkEmpresa;
    }

    public void setFkEmpresa(int fkEmpresa) {
        this.fkEmpresa = fkEmpresa;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Integer getCodigoFut() {
        return codigoFut;
    }

    public void setCodigoFut(Integer codigoFut) {
        this.codigoFut = codigoFut;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public IndicadorGrupo getFkGrupo() {
        return fkGrupo;
    }

    public void setFkGrupo(IndicadorGrupo fkGrupo) {
        this.fkGrupo = fkGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVariable != null ? idVariable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndicadorVariables)) {
            return false;
        }
        IndicadorVariables other = (IndicadorVariables) object;
        if ((this.idVariable == null && other.idVariable != null) || (this.idVariable != null && !this.idVariable.equals(other.idVariable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "efidev.co.modelo.IndicadorVariables[ idVariable=" + idVariable + " ]";
    }

    /**
     * @return the css
     */
    public String getCss() {
        return css;
    }

    /**
     * @param css the css to set
     */
    public void setCss(String css) {
        this.css = css;
    }
    
}
