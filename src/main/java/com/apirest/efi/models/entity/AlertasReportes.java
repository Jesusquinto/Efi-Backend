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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "alertas_reportes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlertasReportes.findAll", query = "SELECT a FROM AlertasReportes a")
    , @NamedQuery(name = "AlertasReportes.findById", query = "SELECT a FROM AlertasReportes a WHERE a.id = :id")
    , @NamedQuery(name = "AlertasReportes.findByCodigoChip", query = "SELECT a FROM AlertasReportes a WHERE a.codigoChip = :codigoChip")
    , @NamedQuery(name = "AlertasReportes.findByCodigoChipReporte", query = "SELECT a FROM AlertasReportes a WHERE a.codigoChipReporte = :codigoChipReporte")
    , @NamedQuery(name = "AlertasReportes.findByPeriodoAnno", query = "SELECT a FROM AlertasReportes a WHERE a.periodoAnno = :periodoAnno")
    , @NamedQuery(name = "AlertasReportes.findByPeriodoMeses", query = "SELECT a FROM AlertasReportes a WHERE a.periodoMeses = :periodoMeses")
    , @NamedQuery(name = "AlertasReportes.findByEstado", query = "SELECT a FROM AlertasReportes a WHERE a.estado = :estado")
    , @NamedQuery(name = "AlertasReportes.findByUltimoReporte", query = "SELECT a FROM AlertasReportes a WHERE a.ultimoReporte = :ultimoReporte")})
public class AlertasReportes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_chip")
    private int codigoChip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "codigo_chip_reporte")
    private String codigoChipReporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "periodo_anno")
    private String periodoAnno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "periodo_meses")
    private String periodoMeses;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @Size(max = 20)
    @Column(name = "ultimo_reporte")
    private String ultimoReporte;

    public AlertasReportes() {
    }

    public AlertasReportes(Long id) {
        this.id = id;
    }

    public AlertasReportes(Long id, int codigoChip, String codigoChipReporte, String periodoAnno, String periodoMeses, int estado) {
        this.id = id;
        this.codigoChip = codigoChip;
        this.codigoChipReporte = codigoChipReporte;
        this.periodoAnno = periodoAnno;
        this.periodoMeses = periodoMeses;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCodigoChip() {
        return codigoChip;
    }

    public void setCodigoChip(int codigoChip) {
        this.codigoChip = codigoChip;
    }

    public String getCodigoChipReporte() {
        return codigoChipReporte;
    }

    public void setCodigoChipReporte(String codigoChipReporte) {
        this.codigoChipReporte = codigoChipReporte;
    }

    public String getPeriodoAnno() {
        return periodoAnno;
    }

    public void setPeriodoAnno(String periodoAnno) {
        this.periodoAnno = periodoAnno;
    }

    public String getPeriodoMeses() {
        return periodoMeses;
    }

    public void setPeriodoMeses(String periodoMeses) {
        this.periodoMeses = periodoMeses;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getUltimoReporte() {
        return ultimoReporte;
    }

    public void setUltimoReporte(String ultimoReporte) {
        this.ultimoReporte = ultimoReporte;
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
        if (!(object instanceof AlertasReportes)) {
            return false;
        }
        AlertasReportes other = (AlertasReportes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "efidev.co.modelo.AlertasReportes[ id=" + id + " ]";
    }
    
}
