package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ReportesChip.class)
public abstract class ReportesChip_ {

	public static volatile SingularAttribute<ReportesChip, Integer> estado;
	public static volatile SingularAttribute<ReportesChip, String> codigoChipReporte;
	public static volatile SingularAttribute<ReportesChip, String> keys;
	public static volatile SingularAttribute<ReportesChip, String> tipoReporte;
	public static volatile SingularAttribute<ReportesChip, Integer> idReporte;
	public static volatile SingularAttribute<ReportesChip, Integer> orden;
	public static volatile SingularAttribute<ReportesChip, String> nombre;
	public static volatile ListAttribute<ReportesChip, IndicadorCuentas> indicadorCuentasList;

	public static final String ESTADO = "estado";
	public static final String CODIGO_CHIP_REPORTE = "codigoChipReporte";
	public static final String KEYS = "keys";
	public static final String TIPO_REPORTE = "tipoReporte";
	public static final String ID_REPORTE = "idReporte";
	public static final String ORDEN = "orden";
	public static final String NOMBRE = "nombre";
	public static final String INDICADOR_CUENTAS_LIST = "indicadorCuentasList";

}

