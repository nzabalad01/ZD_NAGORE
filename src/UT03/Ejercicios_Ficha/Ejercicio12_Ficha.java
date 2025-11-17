package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio12_Ficha {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		System.out.print("Introduce el tamaño del tornillo en cm: ");
		double tamaño = entrada.nextDouble();
	
		if(tamaño >= 1 && tamaño < 3) {
			System.out.println("Demasiado pequeño.");
		}else if (tamaño >= 3 && tamaño < 5) {
			System.out.println("Mediano. ");
		}else if (tamaño >= 5 && tamaño < 6.5) {
			System.out.println("Grande.");
		}else if (tamaño >= 6.5 && tamaño < 8.5) {
			System.out.println("Muy grande");
		}else {
			System.out.println("Tamaño fuera de existencia");
		}
	
	}

}
