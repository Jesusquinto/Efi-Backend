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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jesus
 */
@Entity
@Table(name = "indicador_cuentas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IndicadorCuentas.findAll", query = "SELECT i FROM IndicadorCuentas i"),
    @NamedQuery(name = "IndicadorCuentas.findById", query = "SELECT i FROM IndicadorCuentas i WHERE i.id = :id"),
    @NamedQuery(name = "IndicadorCuentas.findByIdVariable", query = "SELECT i FROM IndicadorCuentas i WHERE i.idVariable = :idVariable")})
public class IndicadorCuentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_variable")
    private int idVariable;
    @JoinColumn(name = "id_cuenta", referencedColumnName = "id_cuenta")
    @ManyToOne(optional = false)
    private PlanCuentas idCuenta;
    @JoinColumn(name = "id_reporte", referencedColumnName = "id_reporte")
    @ManyToOne(optional = false)
    private ReportesChip idReporte;

    public IndicadorCuentas() {
    }

    public IndicadorCuentas(Long id) {
        this.id = id;
    }

    public IndicadorCuentas(Long id, int idVariable) {
        this.id = id;
        this.idVariable = idVariable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdVariable() {
        return idVariable;
    }

    public void setIdVariable(int idVariable) {
        this.idVariable = idVariable;
    }

    public PlanCuentas getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(PlanCuentas idCuenta) {
        this.idCuenta = idCuenta;
    }

    public ReportesChip getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(ReportesChip idReporte) {
        this.idReporte = idReporte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndicadorCuentas)) {
            return false;
        }
        IndicadorCuentas other = (IndicadorCuentas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apirest.efi.models.entity.IndicadorCuentas[ id=" + id + " ]";
    }
    
}
