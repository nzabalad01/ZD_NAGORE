package UT05;

import java.util.Iterator;

public class Ejercicio2 {
	public static void main(String[] args) {
		/*Escribe un programa que tenga un array con 5 nombres de compañeros de clase (puedes ponerlos directamente en el código).
		 * El programa debe mostrar los nombres en el orden en que fueron introducidos.
		 * Luego, debe mostrarlos en orden inverso (del último al primero).
		 * Pista: usa un bucle for que empiece en length - 1 y vaya restando.*/		
		String nombres[] = new String[5];
		
		nombres[0] = "Roberto";
		nombres[1] = "Nagore";
		nombres[2] = "Alejandro";
		nombres[3] = "José";
		nombres[4] = "Ianire";
		
		System.out.println("Nombres en orden: ");
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		System.out.println("\nNombres al inverso: ");
		
		for (int i = nombres.length - 1; i>=0; i--) {
			System.out.println(nombres[i]);
		}
	}
}
