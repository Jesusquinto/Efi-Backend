package com.apirest.efi.models.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Calendario.class)
public abstract class Calendario_ {

	public static volatile SingularAttribute<Calendario, String> codigoChip;
	public static volatile SingularAttribute<Calendario, Integer> Activo;
	public static volatile SingularAttribute<Calendario, String> periodo;
	public static volatile SingularAttribute<Calendario, Date> fechaInicio;
	public static volatile SingularAttribute<Calendario, Date> oportuno;
	public static volatile SingularAttribute<Calendario, Date> fechaFinal;
	public static volatile SingularAttribute<Calendario, Date> extemporaneo;
	public static volatile SingularAttribute<Calendario, Integer> idCalendario;
	public static volatile SingularAttribute<Calendario, String> descripcionChip;

	public static final String CODIGO_CHIP = "codigoChip";
	public static final String ACTIVO = "Activo";
	public static final String PERIODO = "periodo";
	public static final String FECHA_INICIO = "fechaInicio";
	public static final String OPORTUNO = "oportuno";
	public static final String FECHA_FINAL = "fechaFinal";
	public static final String EXTEMPORANEO = "extemporaneo";
	public static final String ID_CALENDARIO = "idCalendario";
	public static final String DESCRIPCION_CHIP = "descripcionChip";

}

