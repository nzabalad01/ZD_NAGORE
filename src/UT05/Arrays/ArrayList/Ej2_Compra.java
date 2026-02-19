package UT05.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ej2_Compra {
	/*Java no permite listas de primitivos (int, double). Debemos usar "Wrappers".

	Declara una ArrayList<Double> llamada precios.
	Añade los precios: 12.50, 23.55, 9.99.
	Añade el precio 45.00 en la primera posición (índice 0), desplazando al resto.
	Recorre la lista con un bucle for-each y calcula el total de la compra.*/
	public static void main(String[] args) {
	
		List<Double> precios = new ArrayList<>();
		
		precios.add(12.50);
		precios.add(23.55);
		precios.add(9.99);
		precios.add(0, 45.00);
		
		System.out.println(precios);
		
		double total = 0;

		for (Double precio : precios) {
		    total += precio;
		}
		
		System.out.println("Total de la compra: " + total);
	
	}
	
	
}
