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
import javax.persistence.Lob;
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
@Table(name = "historicos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historicos.findAll", query = "SELECT h FROM Historicos h"),
    @NamedQuery(name = "Historicos.findById", query = "SELECT h FROM Historicos h WHERE h.id = :id"),
    @NamedQuery(name = "Historicos.findByCodigoFut", query = "SELECT h FROM Historicos h WHERE h.codigoFut = :codigoFut"),
    @NamedQuery(name = "Historicos.findByAnno", query = "SELECT h FROM Historicos h WHERE h.anno = :anno"),
    @NamedQuery(name = "Historicos.findByCuenta", query = "SELECT h FROM Historicos h WHERE h.cuenta = :cuenta"),
    @NamedQuery(name = "Historicos.findByPeriodo", query = "SELECT h FROM Historicos h WHERE h.periodo = :periodo"),
    @NamedQuery(name = "Historicos.findByReporte", query = "SELECT h FROM Historicos h WHERE h.reporte = :reporte")})
public class Historicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "codigo_fut")
    private String codigoFut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "anno")
    private String anno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "cuenta")
    private String cuenta;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "data")
    private String data;
    @Size(max = 255)
    @Column(name = "periodo")
    private String periodo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "reporte")
    private String reporte;

    public Historicos() {
    }

    public Historicos(Long id) {
        this.id = id;
    }

    public Historicos(Long id, String codigoFut, String anno, String cuenta, String data, String reporte) {
        this.id = id;
        this.codigoFut = codigoFut;
        this.anno = anno;
        this.cuenta = cuenta;
        this.data = data;
        this.reporte = reporte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoFut() {
        return codigoFut;
    }

    public void setCodigoFut(String codigoFut) {
        this.codigoFut = codigoFut;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
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
        if (!(object instanceof Historicos)) {
            return false;
        }
        Historicos other = (Historicos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apirest.efi.models.entity.Historicos[ id=" + id + " ]";
    }
    
}
