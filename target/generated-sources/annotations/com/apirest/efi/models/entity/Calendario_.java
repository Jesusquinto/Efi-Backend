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

}

