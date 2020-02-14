package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(IndicadorGrupo.class)
public abstract class IndicadorGrupo_ {

	public static volatile SingularAttribute<IndicadorGrupo, IndicadorTipo> fkTipo;
	public static volatile SingularAttribute<IndicadorGrupo, String> nombreGrupo;
	public static volatile SingularAttribute<IndicadorGrupo, Integer> estado;
	public static volatile SingularAttribute<IndicadorGrupo, String> estilo;
	public static volatile SingularAttribute<IndicadorGrupo, Integer> fkEmpresa;
	public static volatile SingularAttribute<IndicadorGrupo, Integer> idGrupo;

	public static final String FK_TIPO = "fkTipo";
	public static final String NOMBRE_GRUPO = "nombreGrupo";
	public static final String ESTADO = "estado";
	public static final String ESTILO = "estilo";
	public static final String FK_EMPRESA = "fkEmpresa";
	public static final String ID_GRUPO = "idGrupo";

}

