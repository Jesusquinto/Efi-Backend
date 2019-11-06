/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest.efi.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "datos_indicadores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DatosIndicadores.findAll", query = "SELECT d FROM DatosIndicadores d")
    , @NamedQuery(name = "DatosIndicadores.findByPeriodo", query = "SELECT d FROM DatosIndicadores d WHERE d.datosIndicadoresPK.periodo = :periodo")
    , @NamedQuery(name = "DatosIndicadores.findByTipo", query = "SELECT d FROM DatosIndicadores d WHERE d.datosIndicadoresPK.tipo = :tipo")
    , @NamedQuery(name = "DatosIndicadores.findByNombreTipo", query = "SELECT d FROM DatosIndicadores d WHERE d.nombreTipo = :nombreTipo")
    , @NamedQuery(name = "DatosIndicadores.findByCodigoDepartamento", query = "SELECT d FROM DatosIndicadores d WHERE d.codigoDepartamento = :codigoDepartamento")
    , @NamedQuery(name = "DatosIndicadores.findByMunicipio", query = "SELECT d FROM DatosIndicadores d WHERE d.datosIndicadoresPK.municipio = :municipio")
    , @NamedQuery(name = "DatosIndicadores.findByNombreMunicipio", query = "SELECT d FROM DatosIndicadores d WHERE d.nombreMunicipio = :nombreMunicipio")
    , @NamedQuery(name = "DatosIndicadores.findByValor", query = "SELECT d FROM DatosIndicadores d WHERE d.valor = :valor")
    , @NamedQuery(name = "DatosIndicadores.findByValorAnterior", query = "SELECT d FROM DatosIndicadores d WHERE d.valorAnterior = :valorAnterior")
    , @NamedQuery(name = "DatosIndicadores.findByNombredepartamento", query = "SELECT d FROM DatosIndicadores d WHERE d.nombredepartamento = :nombredepartamento")
    , @NamedQuery(name = "DatosIndicadores.findByNacional", query = "SELECT d FROM DatosIndicadores d WHERE d.nacional = :nacional")
    , @NamedQuery(name = "DatosIndicadores.findByNacionalAnterior", query = "SELECT d FROM DatosIndicadores d WHERE d.nacionalAnterior = :nacionalAnterior")
    , @NamedQuery(name = "DatosIndicadores.findByPuesto", query = "SELECT d FROM DatosIndicadores d WHERE d.puesto = :puesto")
    , @NamedQuery(name = "DatosIndicadores.findByPuestoAnterior", query = "SELECT d FROM DatosIndicadores d WHERE d.puestoAnterior = :puestoAnterior")
    , @NamedQuery(name = "DatosIndicadores.findByFkGrupo", query = "SELECT d FROM DatosIndicadores d WHERE d.fkGrupo = :fkGrupo")})
public class DatosIndicadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DatosIndicadoresPK datosIndicadoresPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_tipo")
    private String nombreTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codigo_departamento")
    private String codigoDepartamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_municipio")
    private String nombreMunicipio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private double valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_anterior")
    private double valorAnterior;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre_departamento")
    private String nombredepartamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nacional")
    private int nacional;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nacional_anterior")
    private int nacionalAnterior;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puesto")
    private int puesto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puesto_anterior")
    private int puestoAnterior;
    @Column(name = "fk_grupo")
    private Integer fkGrupo;

    public DatosIndicadores() {
    }

    public DatosIndicadores(DatosIndicadoresPK datosIndicadoresPK) {
        this.datosIndicadoresPK = datosIndicadoresPK;
    }

    public DatosIndicadores(DatosIndicadoresPK datosIndicadoresPK, String nombreTipo, String codigoDepartamento, String nombreMunicipio, double valor, double valorAnterior, String nombredepartamento, int nacional, int nacionalAnterior, int puesto, int puestoAnterior) {
        this.datosIndicadoresPK = datosIndicadoresPK;
        this.nombreTipo = nombreTipo;
        this.codigoDepartamento = codigoDepartamento;
        this.nombreMunicipio = nombreMunicipio;
        this.valor = valor;
        this.valorAnterior = valorAnterior;
        this.nombredepartamento = nombredepartamento;
        this.nacional = nacional;
        this.nacionalAnterior = nacionalAnterior;
        this.puesto = puesto;
        this.puestoAnterior = puestoAnterior;
    }

    public DatosIndicadores(int periodo, int tipo, String municipio) {
        this.datosIndicadoresPK = new DatosIndicadoresPK(periodo, tipo, municipio);
    }

    public DatosIndicadoresPK getDatosIndicadoresPK() {
        return datosIndicadoresPK;
    }

    public void setDatosIndicadoresPK(DatosIndicadoresPK datosIndicadoresPK) {
        this.datosIndicadoresPK = datosIndicadoresPK;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorAnterior() {
        return valorAnterior;
    }

    public void setValorAnterior(double valorAnterior) {
        this.valorAnterior = valorAnterior;
    }

    public String getNombredepartamento() {
        return nombredepartamento;
    }

    public void setNombredepartamento(String nombredepartamento) {
        this.nombredepartamento = nombredepartamento;
    }

    public int getNacional() {
        return nacional;
    }

    public void setNacional(int nacional) {
        this.nacional = nacional;
    }

    public int getNacionalAnterior() {
        return nacionalAnterior;
    }

    public void setNacionalAnterior(int nacionalAnterior) {
        this.nacionalAnterior = nacionalAnterior;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public int getPuestoAnterior() {
        return puestoAnterior;
    }

    public void setPuestoAnterior(int puestoAnterior) {
        this.puestoAnterior = puestoAnterior;
    }

    public Integer getFkGrupo() {
        return fkGrupo;
    }

    public void setFkGrupo(Integer fkGrupo) {
        this.fkGrupo = fkGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (datosIndicadoresPK != null ? datosIndicadoresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosIndicadores)) {
            return false;
        }
        DatosIndicadores other = (DatosIndicadores) object;
        if ((this.datosIndicadoresPK == null && other.datosIndicadoresPK != null) || (this.datosIndicadoresPK != null && !this.datosIndicadoresPK.equals(other.datosIndicadoresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "efidev.co.modelo.DatosIndicadores[ datosIndicadoresPK=" + datosIndicadoresPK + " ]";
    }
    
}
