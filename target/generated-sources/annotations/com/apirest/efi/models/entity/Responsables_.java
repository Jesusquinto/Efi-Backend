package com.apirest.efi.models.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Responsables.class)
public abstract class Responsables_ {

	public static volatile SingularAttribute<Responsables, Integer> confirmacion;
	public static volatile SingularAttribute<Responsables, ResultadoEncuesta> resultadoEncuesta;
	public static volatile SingularAttribute<Responsables, Date> fechaConfirmacion;
	public static volatile SingularAttribute<Responsables, String> apellido;
	public static volatile SingularAttribute<Responsables, String> correo;
	public static volatile SingularAttribute<Responsables, String> identificacion;
	public static volatile SingularAttribute<Responsables, Empresa> idEmpresa;
	public static volatile SingularAttribute<Responsables, Long> id;
	public static volatile SingularAttribute<Responsables, String> telefono;
	public static volatile SingularAttribute<Responsables, String> cargo;
	public static volatile SingularAttribute<Responsables, String> nombre;

	public static final String CONFIRMACION = "confirmacion";
	public static final String RESULTADO_ENCUESTA = "resultadoEncuesta";
	public static final String FECHA_CONFIRMACION = "fechaConfirmacion";
	public static final String APELLIDO = "apellido";
	public static final String CORREO = "correo";
	public static final String IDENTIFICACION = "identificacion";
	public static final String ID_EMPRESA = "idEmpresa";
	public static final String ID = "id";
	public static final String TELEFONO = "telefono";
	public static final String CARGO = "cargo";
	public static final String NOMBRE = "nombre";

}

