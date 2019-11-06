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
import javax.persistence.Lob;
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
@Table(name = "resultado_encuesta_detalle")
public class ResultadoEncuestaDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultado")
    private short resultado;
    @Basic(optional = false)
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "observacion")
    private String observacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "seguimiento")
    private short seguimiento;
    @Column(name = "fecha_seguimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSeguimiento;
    @JoinColumn(name = "id_resultado_encuesta", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ResultadoEncuesta idResultadoEncuesta;
    @JoinColumn(name = "id_pregunta", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Preguntas idPregunta;
    
    @NotNull
    @Column(name = "estado")
    private int estado;
    
    @JoinColumn(name = "id_responsable", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Responsables idResponsable;
        

    

      public ResultadoEncuestaDetalle(Long id) {
        this.id = id;
    }

  

}
