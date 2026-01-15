package UT04.Apdo09.Ej3;

import UT04.Apdo09.Ej3.Persona;

public class Profesor extends Persona {

	String especialidad;
	
	public Profesor(String n, int e, String espe) {
		super(n, e);
		this.especialidad=espe;		
	}
	
}
