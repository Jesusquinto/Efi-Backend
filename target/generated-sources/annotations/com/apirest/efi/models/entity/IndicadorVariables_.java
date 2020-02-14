package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(IndicadorVariables.class)
public abstract class IndicadorVariables_ {

	public static volatile SingularAttribute<IndicadorVariables, Integer> estado;
	public static volatile SingularAttribute<IndicadorVariables, String> css;
	public static volatile SingularAttribute<IndicadorVariables, IndicadorGrupo> fkGrupo;
	public static volatile SingularAttribute<IndicadorVariables, Integer> codigoFut;
	public static volatile SingularAttribute<IndicadorVariables, String> nombreVariable;
	public static volatile SingularAttribute<IndicadorVariables, Integer> fkEmpresa;
	public static volatile SingularAttribute<IndicadorVariables, Integer> orden;
	public static volatile SingularAttribute<IndicadorVariables, Integer> idVariable;

	public static final String ESTADO = "estado";
	public static final String CSS = "css";
	public static final String FK_GRUPO = "fkGrupo";
	public static final String CODIGO_FUT = "codigoFut";
	public static final String NOMBRE_VARIABLE = "nombreVariable";
	public static final String FK_EMPRESA = "fkEmpresa";
	public static final String ORDEN = "orden";
	public static final String ID_VARIABLE = "idVariable";

}

