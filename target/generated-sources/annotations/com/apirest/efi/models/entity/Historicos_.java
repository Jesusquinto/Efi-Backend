package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Historicos.class)
public abstract class Historicos_ {

	public static volatile SingularAttribute<Historicos, String> anno;
	public static volatile SingularAttribute<Historicos, String> data;
	public static volatile SingularAttribute<Historicos, String> periodo;
	public static volatile SingularAttribute<Historicos, String> codigoFut;
	public static volatile SingularAttribute<Historicos, String> cuenta;
	public static volatile SingularAttribute<Historicos, Long> id;
	public static volatile SingularAttribute<Historicos, String> reporte;

	public static final String ANNO = "anno";
	public static final String DATA = "data";
	public static final String PERIODO = "periodo";
	public static final String CODIGO_FUT = "codigoFut";
	public static final String CUENTA = "cuenta";
	public static final String ID = "id";
	public static final String REPORTE = "reporte";

}

