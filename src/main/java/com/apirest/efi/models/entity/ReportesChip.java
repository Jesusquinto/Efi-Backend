/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.efi.models.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author jesus
 */
@Entity
@Table(name = "reportes_chip")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReportesChip.findAll", query = "SELECT r FROM ReportesChip r"),
    @NamedQuery(name = "ReportesChip.findByIdReporte", query = "SELECT r FROM ReportesChip r WHERE r.idReporte = :idReporte"),
    @NamedQuery(name = "ReportesChip.findByCodigoChipReporte", query = "SELECT r FROM ReportesChip r WHERE r.codigoChipReporte = :codigoChipReporte"),
    @NamedQuery(name = "ReportesChip.findByNombre", query = "SELECT r FROM ReportesChip r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "ReportesChip.findByOrden", query = "SELECT r FROM ReportesChip r WHERE r.orden = :orden"),
    @NamedQuery(name = "ReportesChip.findByEstado", query = "SELECT r FROM ReportesChip r WHERE r.estado = :estado"),
    @NamedQuery(name = "ReportesChip.findByTipoReporte", query = "SELECT r FROM ReportesChip r WHERE r.tipoReporte = :tipoReporte")})
public class ReportesChip implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_reporte")
    private Integer idReporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "codigo_chip_reporte")
    private String codigoChipReporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "orden")
    private int orden;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @Size(max = 10)
    @Column(name = "tipo_reporte")
    private String tipoReporte;
    @Column(name = "keys")
    private String keys;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idReporte")
    private List<IndicadorCuentas> indicadorCuentasList;

    public ReportesChip() {
    }

    public ReportesChip(Integer idReporte) {
        this.idReporte = idReporte;
    }

    public ReportesChip(Integer idReporte, String codigoChipReporte, String nombre, int orden, int estado) {
        this.idReporte = idReporte;
        this.codigoChipReporte = codigoChipReporte;
        this.nombre = nombre;
        this.orden = orden;
        this.estado = estado;
    }

    public Integer getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Integer idReporte) {
        this.idReporte = idReporte;
    }

    public String getCodigoChipReporte() {
        return codigoChipReporte;
    }

    public void setCodigoChipReporte(String codigoChipReporte) {
        this.codigoChipReporte = codigoChipReporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    @XmlTransient
    @JsonIgnore
    public List<IndicadorCuentas> getIndicadorCuentasList() {
        return indicadorCuentasList;
    }

    public void setIndicadorCuentasList(List<IndicadorCuentas> indicadorCuentasList) {
        this.indicadorCuentasList = indicadorCuentasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReporte != null ? idReporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReportesChip)) {
            return false;
        }
        ReportesChip other = (ReportesChip) object;
        if ((this.idReporte == null && other.idReporte != null) || (this.idReporte != null && !this.idReporte.equals(other.idReporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apirest.efi.models.entity.ReportesChip[ idReporte=" + idReporte + " ]";
    }

    /**
     * @return the keys
     */
    public String getKeys() {
        return keys;
    }

    /**
     * @param keys the keys to set
     */
    public void setKeys(String keys) {
        this.keys = keys;
    }
    
}
