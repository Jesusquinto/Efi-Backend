package com.apirest.efi.models.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DatosIndicadores.class)
public abstract class DatosIndicadores_ {

	public static volatile SingularAttribute<DatosIndicadores, String> nombreTipo;
	public static volatile SingularAttribute<DatosIndicadores, Integer> puesto;
	public static volatile SingularAttribute<DatosIndicadores, String> codigoDepartamento;
	public static volatile SingularAttribute<DatosIndicadores, Integer> fkGrupo;
	public static volatile SingularAttribute<DatosIndicadores, Integer> puestoAnterior;
	public static volatile SingularAttribute<DatosIndicadores, DatosIndicadoresPK> datosIndicadoresPK;
	public static volatile SingularAttribute<DatosIndicadores, String> nombreMunicipio;
	public static volatile SingularAttribute<DatosIndicadores, Double> valor;
	public static volatile SingularAttribute<DatosIndicadores, Integer> nacionalAnterior;
	public static volatile SingularAttribute<DatosIndicadores, Integer> nacional;
	public static volatile SingularAttribute<DatosIndicadores, Double> valorAnterior;
	public static volatile SingularAttribute<DatosIndicadores, String> nombredepartamento;

	public static final String NOMBRE_TIPO = "nombreTipo";
	public static final String PUESTO = "puesto";
	public static final String CODIGO_DEPARTAMENTO = "codigoDepartamento";
	public static final String FK_GRUPO = "fkGrupo";
	public static final String PUESTO_ANTERIOR = "puestoAnterior";
	public static final String DATOS_INDICADORES_PK = "datosIndicadoresPK";
	public static final String NOMBRE_MUNICIPIO = "nombreMunicipio";
	public static final String VALOR = "valor";
	public static final String NACIONAL_ANTERIOR = "nacionalAnterior";
	public static final String NACIONAL = "nacional";
	public static final String VALOR_ANTERIOR = "valorAnterior";
	public static final String NOMBREDEPARTAMENTO = "nombredepartamento";

}

