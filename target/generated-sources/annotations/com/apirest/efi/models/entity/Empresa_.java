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

}

