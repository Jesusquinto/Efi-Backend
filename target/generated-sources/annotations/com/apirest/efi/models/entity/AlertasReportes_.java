package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AlertasReportes.class)
public abstract class AlertasReportes_ {

	public static volatile SingularAttribute<AlertasReportes, Integer> estado;
	public static volatile SingularAttribute<AlertasReportes, Integer> codigoChip;
	public static volatile SingularAttribute<AlertasReportes, String> ultimoReporte;
	public static volatile SingularAttribute<AlertasReportes, String> codigoChipReporte;
	public static volatile SingularAttribute<AlertasReportes, String> periodoMeses;
	public static volatile SingularAttribute<AlertasReportes, Long> id;
	public static volatile SingularAttribute<AlertasReportes, String> periodoAnno;

	public static final String ESTADO = "estado";
	public static final String CODIGO_CHIP = "codigoChip";
	public static final String ULTIMO_REPORTE = "ultimoReporte";
	public static final String CODIGO_CHIP_REPORTE = "codigoChipReporte";
	public static final String PERIODO_MESES = "periodoMeses";
	public static final String ID = "id";
	public static final String PERIODO_ANNO = "periodoAnno";

}

