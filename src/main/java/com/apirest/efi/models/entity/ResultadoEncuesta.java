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
@Table(name = "resultado_encuesta")
public class ResultadoEncuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id" )
    private Long id;
    @Basic(optional = false)
    @NotNull
     @JoinColumn(name = "id_entidad", referencedColumnName = "id_entidad")
    @ManyToOne(optional = false)
    private Entidades idEntidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "periodo")
    private String periodo;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empresa idEmpresa;
    @JoinColumn(name = "id_encuesta", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Encuestas idEncuesta;
    
    @NotNull
    @Column(name = "estado")
    private int estado;

    @NotNull
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuarios idUsuario;

    @NotNull
    @Column(name = "consecutivo")
    private String consecutivo;

    @Column(name = "user_confirmacion")
    private int userConfirmacion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_confirmacion")
    private Date fechaConfirmacion;
    

    
    public ResultadoEncuesta(Long id) {
        this.id = id;
    }
    
}
