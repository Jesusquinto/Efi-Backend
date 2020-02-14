package com.apirest.efi.models.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Encuestas.class)
public abstract class Encuestas_ {

	public static volatile SingularAttribute<Encuestas, Date> fecha;
	public static volatile SingularAttribute<Encuestas, Integer> estado;
	public static volatile SingularAttribute<Encuestas, Usuarios> idUsuario;
	public static volatile SingularAttribute<Encuestas, Empresa> idEmpresa;
	public static volatile SingularAttribute<Encuestas, Long> id;
	public static volatile SingularAttribute<Encuestas, String> nombre;

	public static final String FECHA = "fecha";
	public static final String ESTADO = "estado";
	public static final String ID_USUARIO = "idUsuario";
	public static final String ID_EMPRESA = "idEmpresa";
	public static final String ID = "id";
	public static final String NOMBRE = "nombre";

}

