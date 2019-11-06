package com.apirest.efi.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "calendario")
public class Calendario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_calendario")
    private Integer idCalendario;
    @Size(max = 10)
    @Column(name = "periodo")
    private String periodo;
    @Size(max = 10)
    @Column(name = "codigo_chip")
    private String codigoChip;
    @Size(max = 20)
    @Column(name = "descripcion_chip")
    private String descripcionChip;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_final")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Column(name = "oportuno")
    @Temporal(TemporalType.DATE)
    private Date oportuno;
    @Column(name = "extemporaneo")
    @Temporal(TemporalType.DATE)
    private Date extemporaneo;
    @Column(name = "activo")
    private Integer Activo;
    
}
