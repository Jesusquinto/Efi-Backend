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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "entidades")
public class Entidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_entidad")
    private Long idEntidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_chip")
    private int codigoChip;
    @Size(max = 50)
    @Column(name = "codigo_dane")
    private String codigoDane;
    @Size(max = 10)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Entidad")
    private String entidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estado")
    private Integer estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nit")
    private String nit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Departamento")
    private String departamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Ciudad")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "Codigo_Postal")
    private Integer codigoPostal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Telefonos")
    private String telefonos;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Fax")
    private String fax;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Sector")
    private String sector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Naturaleza")
    private String naturaleza;
    @Size(max = 100)
    @Column(name = "pagina_web")
    private String paginaWeb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fk_categoria")
    private long fkCategoria;



   
    public Entidades(Long idEntidad) {
        this.idEntidad = idEntidad;
    }

    
}
