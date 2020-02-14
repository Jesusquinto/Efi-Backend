package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(IndicadorCuentas.class)
public abstract class IndicadorCuentas_ {

	public static volatile SingularAttribute<IndicadorCuentas, Long> id;
	public static volatile SingularAttribute<IndicadorCuentas, ReportesChip> idReporte;
	public static volatile SingularAttribute<IndicadorCuentas, PlanCuentas> idCuenta;
	public static volatile SingularAttribute<IndicadorCuentas, Integer> idVariable;

	public static final String ID = "id";
	public static final String ID_REPORTE = "idReporte";
	public static final String ID_CUENTA = "idCuenta";
	public static final String ID_VARIABLE = "idVariable";

}

