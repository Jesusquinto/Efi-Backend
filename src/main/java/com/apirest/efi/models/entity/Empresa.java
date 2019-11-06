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
@Table(name = "empresa")
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 200)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nit")
    private String nit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "contacto_nombre")
    private String contactoNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "contacto_cargo")
    private String contactoCargo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "contacto_telefono")
    private String contactoTelefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "contacto_email")
    private String contactoEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "licencia")
    private String licencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "orden")
    private String orden;
    @Size(max = 200)
    @Column(name = "logo")
    private String logo;
    @Basic(optional = false)
    @NotNull
    @JoinColumn(name = "fk_entidad", referencedColumnName = "id_entidad")
    @ManyToOne(optional = false)
    private Entidades fkEntidad;
    @Column(name = "estado")
    private Integer estado;
 

   
    public Empresa(Long id) {
        this.id = id;
    }

  


    
    
}
