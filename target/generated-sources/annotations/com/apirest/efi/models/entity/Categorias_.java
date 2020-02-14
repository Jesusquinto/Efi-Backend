package com.apirest.efi.models.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Categorias.class)
public abstract class Categorias_ {

	public static volatile SingularAttribute<Categorias, BigDecimal> habitantesInferior;
	public static volatile SingularAttribute<Categorias, Integer> estado;
	public static volatile SingularAttribute<Categorias, BigDecimal> habitantesSuperior;
	public static volatile SingularAttribute<Categorias, BigDecimal> limiteGasto;
	public static volatile SingularAttribute<Categorias, String> categoria;
	public static volatile SingularAttribute<Categorias, Long> ingresosCorrientes;
	public static volatile SingularAttribute<Categorias, String> descripcionCategoria;
	public static volatile SingularAttribute<Categorias, Long> idCategoria;

	public static final String HABITANTES_INFERIOR = "habitantesInferior";
	public static final String ESTADO = "estado";
	public static final String HABITANTES_SUPERIOR = "habitantesSuperior";
	public static final String LIMITE_GASTO = "limiteGasto";
	public static final String CATEGORIA = "categoria";
	public static final String INGRESOS_CORRIENTES = "ingresosCorrientes";
	public static final String DESCRIPCION_CATEGORIA = "descripcionCategoria";
	public static final String ID_CATEGORIA = "idCategoria";

}

