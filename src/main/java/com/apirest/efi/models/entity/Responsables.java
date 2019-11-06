package com.apirest.efi.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "responsables")
public class Responsables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "identificacion")
    private String identificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "correo")
    private String correo;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empresa idEmpresa;
    @Basic(optional = false)
    @Size(min = 1, max = 255)
    @Column(name = "cargo")
    private String cargo;
    @JoinColumn(name = "resultado_encuesta", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ResultadoEncuesta resultadoEncuesta;
    @NotNull
    @Column(name = "confirmacion")
    private int confirmacion;
    
    
    @Column(name = "fecha_confirmacion") 
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConfirmacion;
    
       
    public Responsables(Long id) {
        this.id = id;
    }
    
    
}
