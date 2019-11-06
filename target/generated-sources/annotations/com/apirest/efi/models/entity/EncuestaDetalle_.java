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

}

