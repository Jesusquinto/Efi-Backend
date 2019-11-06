package com.apirest.efi.models.entity;

import java.io.Serializable;

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
@Table(name = "plan_cuentas")
public class PlanCuentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cuenta")
    private Integer idCuenta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "tipo_plan")
    private String tipoPlan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "orden")
    private int orden;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 10)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 10)
    @Column(name = "nivel")
    private String nivel;
    @Size(max = 10)
    @Column(name = "entidad")
    private String entidad;
    @Column(name = "estado")
    private Integer estado;



    public PlanCuentas(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }



   
    
}
