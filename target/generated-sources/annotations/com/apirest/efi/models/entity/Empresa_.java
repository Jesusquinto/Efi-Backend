package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Empresa.class)
public abstract class Empresa_ {

	public static volatile SingularAttribute<Empresa, String> contactoNombre;
	public static volatile SingularAttribute<Empresa, Integer> estado;
	public static volatile SingularAttribute<Empresa, String> direccion;
	public static volatile SingularAttribute<Empresa, String> nombre;
	public static volatile SingularAttribute<Empresa, String> contactoTelefono;
	public static volatile SingularAttribute<Empresa, String> contactoEmail;
	public static volatile SingularAttribute<Empresa, String> licencia;
	public static volatile SingularAttribute<Empresa, String> contactoCargo;
	public static volatile SingularAttribute<Empresa, String> nit;
	public static volatile SingularAttribute<Empresa, String> logo;
	public static volatile SingularAttribute<Empresa, Long> id;
	public static volatile SingularAttribute<Empresa, String> orden;
	public static volatile SingularAttribute<Empresa, String> telefono;
	public static volatile SingularAttribute<Empresa, Entidades> fkEntidad;

	public static final String CONTACTO_NOMBRE = "contactoNombre";
	public static final String ESTADO = "estado";
	public static final String DIRECCION = "direccion";
	public static final String NOMBRE = "nombre";
	public static final String CONTACTO_TELEFONO = "contactoTelefono";
	public static final String CONTACTO_EMAIL = "contactoEmail";
	public static final String LICENCIA = "licencia";
	public static final String CONTACTO_CARGO = "contactoCargo";
	public static final String NIT = "nit";
	public static final String LOGO = "logo";
	public static final String ID = "id";
	public static final String ORDEN = "orden";
	public static final String TELEFONO = "telefono";
	public static final String FK_ENTIDAD = "fkEntidad";

}

