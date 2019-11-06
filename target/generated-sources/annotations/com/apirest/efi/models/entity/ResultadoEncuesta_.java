package com.apirest.efi.models.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ResultadoEncuesta.class)
public abstract class ResultadoEncuesta_ {

	public static volatile SingularAttribute<ResultadoEncuesta, Entidades> idEntidad;
	public static volatile SingularAttribute<ResultadoEncuesta, String> consecutivo;
	public static volatile SingularAttribute<ResultadoEncuesta, Date> fecha;
	public static volatile SingularAttribute<ResultadoEncuesta, Integer> estado;
	public static volatile SingularAttribute<ResultadoEncuesta, String> periodo;
	public static volatile SingularAttribute<ResultadoEncuesta, Date> fechaConfirmacion;
	public static volatile SingularAttribute<ResultadoEncuesta, Usuarios> idUsuario;
	public static volatile SingularAttribute<ResultadoEncuesta, Integer> userConfirmacion;
	public static volatile SingularAttribute<ResultadoEncuesta, Encuestas> idEncuesta;
	public static volatile SingularAttribute<ResultadoEncuesta, Empresa> idEmpresa;
	public static volatile SingularAttribute<ResultadoEncuesta, Long> id;

}

