package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EncuestaDetalle.class)
public abstract class EncuestaDetalle_ {

	public static volatile SingularAttribute<EncuestaDetalle, Integer> estado;
	public static volatile SingularAttribute<EncuestaDetalle, Encuestas> idEncuesta;
	public static volatile SingularAttribute<EncuestaDetalle, Long> id;
	public static volatile SingularAttribute<EncuestaDetalle, Short> requerido;
	public static volatile SingularAttribute<EncuestaDetalle, Preguntas> idPregunta;

	public static final String ESTADO = "estado";
	public static final String ID_ENCUESTA = "idEncuesta";
	public static final String ID = "id";
	public static final String REQUERIDO = "requerido";
	public static final String ID_PREGUNTA = "idPregunta";

}

