package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(IndicadorTipo.class)
public abstract class IndicadorTipo_ {

	public static volatile SingularAttribute<IndicadorTipo, String> nombreTipo;
	public static volatile SingularAttribute<IndicadorTipo, Integer> estado;
	public static volatile SingularAttribute<IndicadorTipo, String> tipo;
	public static volatile SingularAttribute<IndicadorTipo, Integer> idTipoIndicador;
	public static volatile SingularAttribute<IndicadorTipo, Integer> fkEmpresa;

	public static final String NOMBRE_TIPO = "nombreTipo";
	public static final String ESTADO = "estado";
	public static final String TIPO = "tipo";
	public static final String ID_TIPO_INDICADOR = "idTipoIndicador";
	public static final String FK_EMPRESA = "fkEmpresa";

}

