package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Preguntas.class)
public abstract class Preguntas_ {

	public static volatile SingularAttribute<Preguntas, String> descripcion;
	public static volatile SingularAttribute<Preguntas, String> codigo;
	public static volatile SingularAttribute<Preguntas, Integer> estado;
	public static volatile SingularAttribute<Preguntas, String> responsable;
	public static volatile SingularAttribute<Preguntas, String> periodo;
	public static volatile SingularAttribute<Preguntas, Empresa> idEmpresa;
	public static volatile SingularAttribute<Preguntas, Long> id;
	public static volatile SingularAttribute<Preguntas, CategoriasPregunta> idCategoria;
	public static volatile SingularAttribute<Preguntas, String> referencia;
	public static volatile SingularAttribute<Preguntas, GruposPregunta> idGrupo;

	public static final String DESCRIPCION = "descripcion";
	public static final String CODIGO = "codigo";
	public static final String ESTADO = "estado";
	public static final String RESPONSABLE = "responsable";
	public static final String PERIODO = "periodo";
	public static final String ID_EMPRESA = "idEmpresa";
	public static final String ID = "id";
	public static final String ID_CATEGORIA = "idCategoria";
	public static final String REFERENCIA = "referencia";
	public static final String ID_GRUPO = "idGrupo";

}

