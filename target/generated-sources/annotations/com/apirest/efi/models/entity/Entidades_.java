package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Entidades.class)
public abstract class Entidades_ {

	public static volatile SingularAttribute<Entidades, String> tipo;
	public static volatile SingularAttribute<Entidades, Integer> estado;
	public static volatile SingularAttribute<Entidades, String> paginaWeb;
	public static volatile SingularAttribute<Entidades, Integer> codigoPostal;
	public static volatile SingularAttribute<Entidades, String> direccion;
	public static volatile SingularAttribute<Entidades, Long> idEntidad;
	public static volatile SingularAttribute<Entidades, Integer> codigoChip;
	public static volatile SingularAttribute<Entidades, String> naturaleza;
	public static volatile SingularAttribute<Entidades, String> ciudad;
	public static volatile SingularAttribute<Entidades, Long> fkCategoria;
	public static volatile SingularAttribute<Entidades, String> entidad;
	public static volatile SingularAttribute<Entidades, String> correo;
	public static volatile SingularAttribute<Entidades, String> nit;
	public static volatile SingularAttribute<Entidades, String> departamento;
	public static volatile SingularAttribute<Entidades, String> codigoDane;
	public static volatile SingularAttribute<Entidades, String> telefonos;
	public static volatile SingularAttribute<Entidades, String> fax;
	public static volatile SingularAttribute<Entidades, String> sector;

	public static final String TIPO = "tipo";
	public static final String ESTADO = "estado";
	public static final String PAGINA_WEB = "paginaWeb";
	public static final String CODIGO_POSTAL = "codigoPostal";
	public static final String DIRECCION = "direccion";
	public static final String ID_ENTIDAD = "idEntidad";
	public static final String CODIGO_CHIP = "codigoChip";
	public static final String NATURALEZA = "naturaleza";
	public static final String CIUDAD = "ciudad";
	public static final String FK_CATEGORIA = "fkCategoria";
	public static final String ENTIDAD = "entidad";
	public static final String CORREO = "correo";
	public static final String NIT = "nit";
	public static final String DEPARTAMENTO = "departamento";
	public static final String CODIGO_DANE = "codigoDane";
	public static final String TELEFONOS = "telefonos";
	public static final String FAX = "fax";
	public static final String SECTOR = "sector";

}

