package com.apirest.efi.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "categorias")
public class Categorias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_categoria")
    private Long idCategoria;
    @Size(max = 50)
    @Column(name = "categoria")
    private String categoria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "descripcion_categoria")
    private String descripcionCategoria;
    @Column(name = "limite_gasto")
    private BigDecimal limiteGasto;
    @Column(name = "habitantes_inferior")
    private BigDecimal habitantesInferior;
    @Column(name = "habitantes_superior")
    private BigDecimal habitantesSuperior;
    @Column(name = "ingresos_corrientes")
    private Long ingresosCorrientes;

    @NotNull
    @Column(name = "estado")
    private Integer estado;


    public Categorias(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

   
    
}
