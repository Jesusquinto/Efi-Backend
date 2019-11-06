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

/**
 *
 * @author jesus
 */
@Entity
@Table(name = "alertas_datos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlertasDatos.findAll", query = "SELECT a FROM AlertasDatos a"),
    @NamedQuery(name = "AlertasDatos.findByIdAlertasDatos", query = "SELECT a FROM AlertasDatos a WHERE a.idAlertasDatos = :idAlertasDatos"),
    @NamedQuery(name = "AlertasDatos.findByPeriodoAnno", query = "SELECT a FROM AlertasDatos a WHERE a.periodoAnno = :periodoAnno"),
    @NamedQuery(name = "AlertasDatos.findByPeriodoMes", query = "SELECT a FROM AlertasDatos a WHERE a.periodoMes = :periodoMes"),
    @NamedQuery(name = "AlertasDatos.findByCodigoChip", query = "SELECT a FROM AlertasDatos a WHERE a.codigoChip = :codigoChip"),
    @NamedQuery(name = "AlertasDatos.findByCobertura", query = "SELECT a FROM AlertasDatos a WHERE a.cobertura = :cobertura"),
    @NamedQuery(name = "AlertasDatos.findByOportunidad", query = "SELECT a FROM AlertasDatos a WHERE a.oportunidad = :oportunidad"),
    @NamedQuery(name = "AlertasDatos.findByCalidad", query = "SELECT a FROM AlertasDatos a WHERE a.calidad = :calidad"),
    @NamedQuery(name = "AlertasDatos.findByIndicadorFut", query = "SELECT a FROM AlertasDatos a WHERE a.indicadorFut = :indicadorFut")})
public class AlertasDatos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_alertas_datos")
    private Integer idAlertasDatos;
    @Size(max = 50)
    @Column(name = "periodo_anno")
    private String periodoAnno;
    @Size(max = 50)
    @Column(name = "periodo_mes")
    private String periodoMes;
    @Size(max = 50)
    @Column(name = "codigo_chip")
    private String codigoChip;
    @Size(max = 50)
    @Column(name = "cobertura")
    private String cobertura;
    @Size(max = 50)
    @Column(name = "oportunidad")
    private String oportunidad;
    @Size(max = 50)
    @Column(name = "calidad")
    private String calidad;
    @Size(max = 50)
    @Column(name = "indicador_fut")
    private String indicadorFut;

    public AlertasDatos() {
    }

    public AlertasDatos(Integer idAlertasDatos) {
        this.idAlertasDatos = idAlertasDatos;
    }

    public Integer getIdAlertasDatos() {
        return idAlertasDatos;
    }

    public void setIdAlertasDatos(Integer idAlertasDatos) {
        this.idAlertasDatos = idAlertasDatos;
    }

    public String getPeriodoAnno() {
        return periodoAnno;
    }

    public void setPeriodoAnno(String periodoAnno) {
        this.periodoAnno = periodoAnno;
    }

    public String getPeriodoMes() {
        return periodoMes;
    }

    public void setPeriodoMes(String periodoMes) {
        this.periodoMes = periodoMes;
    }

    public String getCodigoChip() {
        return codigoChip;
    }

    public void setCodigoChip(String codigoChip) {
        this.codigoChip = codigoChip;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getOportunidad() {
        return oportunidad;
    }

    public void setOportunidad(String oportunidad) {
        this.oportunidad = oportunidad;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getIndicadorFut() {
        return indicadorFut;
    }

    public void setIndicadorFut(String indicadorFut) {
        this.indicadorFut = indicadorFut;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlertasDatos != null ? idAlertasDatos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlertasDatos)) {
            return false;
        }
        AlertasDatos other = (AlertasDatos) object;
        if ((this.idAlertasDatos == null && other.idAlertasDatos != null) || (this.idAlertasDatos != null && !this.idAlertasDatos.equals(other.idAlertasDatos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apirest.efi.models.entity.AlertasDatos[ idAlertasDatos=" + idAlertasDatos + " ]";
    }
    
}
