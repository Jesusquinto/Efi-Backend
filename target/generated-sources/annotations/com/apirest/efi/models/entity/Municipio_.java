package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Municipio.class)
public abstract class Municipio_ {

	public static volatile SingularAttribute<Municipio, Integer> fkCategorias;
	public static volatile SingularAttribute<Municipio, String> municipio;
	public static volatile SingularAttribute<Municipio, String> nombreMunicipio;
	public static volatile SingularAttribute<Municipio, Integer> idMunicipio;

	public static final String FK_CATEGORIAS = "fkCategorias";
	public static final String MUNICIPIO = "municipio";
	public static final String NOMBRE_MUNICIPIO = "nombreMunicipio";
	public static final String ID_MUNICIPIO = "idMunicipio";

}

