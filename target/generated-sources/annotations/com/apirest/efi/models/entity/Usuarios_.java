package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuarios.class)
public abstract class Usuarios_ {

	public static volatile SingularAttribute<Usuarios, String> password;
	public static volatile SingularAttribute<Usuarios, String> apellido;
	public static volatile ListAttribute<Usuarios, Roles> roles;
	public static volatile SingularAttribute<Usuarios, String> documento;
	public static volatile SingularAttribute<Usuarios, Empresa> idEmpresa;
	public static volatile SingularAttribute<Usuarios, Long> id;
	public static volatile SingularAttribute<Usuarios, String> nombre;
	public static volatile SingularAttribute<Usuarios, String> email;
	public static volatile SingularAttribute<Usuarios, Boolean> enabled;
	public static volatile SingularAttribute<Usuarios, String> username;

}

