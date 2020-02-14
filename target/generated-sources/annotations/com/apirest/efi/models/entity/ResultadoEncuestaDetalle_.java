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

	public static final String ID_RESULTADO_ENCUESTA = "idResultadoEncuesta";
	public static final String ESTADO = "estado";
	public static final String RESULTADO = "resultado";
	public static final String SEGUIMIENTO = "seguimiento";
	public static final String FECHA_SEGUIMIENTO = "fechaSeguimiento";
	public static final String ID_RESPONSABLE = "idResponsable";
	public static final String ID = "id";
	public static final String OBSERVACION = "observacion";
	public static final String ID_PREGUNTA = "idPregunta";

}

