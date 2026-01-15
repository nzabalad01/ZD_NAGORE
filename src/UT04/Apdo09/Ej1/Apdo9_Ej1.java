package UT04.Apdo09.Ej1;

import UT04.Apdo09.Ej1.Animal;
import UT04.Apdo09.Ej1.Gato;
import UT04.Apdo09.Ej1.Pajaro;
import UT04.Apdo09.Ej1.Perro;

public class Apdo9_Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Animal();
		Perro p = new Perro();
		Gato g = new Gato();
		Pajaro j = new Pajaro();
		
		a.comer();
		a.sonido();
		
		p.sonido();
		p.dormir();
		
		g.sonido();
		g.comer();
		
		j.sonido();
		j.dormir();
		
		
		
		
		
		
		
		
	}
}
