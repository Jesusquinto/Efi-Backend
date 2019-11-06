package com.apirest.efi.models.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ResultadoEncuestaDetalle.class)
public abstract class ResultadoEncuestaDetalle_ {

	public static volatile SingularAttribute<ResultadoEncuestaDetalle, ResultadoEncuesta> idResultadoEncuesta;
	public static volatile SingularAttribute<ResultadoEncuestaDetalle, Integer> estado;
	public static volatile SingularAttribute<ResultadoEncuestaDetalle, Short> resultado;
	public static volatile SingularAttribute<ResultadoEncuestaDetalle, Short> seguimiento;
	public static volatile SingularAttribute<ResultadoEncuestaDetalle, Date> fechaSeguimiento;
	public static volatile SingularAttribute<ResultadoEncuestaDetalle, Responsables> idResponsable;
	public static volatile SingularAttribute<ResultadoEncuestaDetalle, Long> id;
	public static volatile SingularAttribute<ResultadoEncuestaDetalle, String> observacion;
	public static volatile SingularAttribute<ResultadoEncuestaDetalle, Preguntas> idPregunta;

}

