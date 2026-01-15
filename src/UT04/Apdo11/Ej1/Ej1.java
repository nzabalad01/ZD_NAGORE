package UT04.Apdo11.Ej1;

import UT04.Apdo11.Ej1.Ordenador;
import UT04.Apdo11.Ej1.Procesador;

public class Ej1 {

	public static void main(String[] args) {

		Ordenador portatil = new Ordenador(8, 1, "Gigabyte GeForce RTX 5060 WINDFORCE", 2.4, 4);
		portatil.mostrarInfo();
		
		
		Procesador p = new Procesador(3, 8);
		Ordenador sobremesa = new Ordenador(16, 2, "Gigabyte GeForce RTX 5060 WINDFORCE", p);
				
		
		
	}
}
