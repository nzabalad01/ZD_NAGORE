package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio19_Ficha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int suma = 0;
		
		for (int i = 1; i <= 100; i++) {
			suma += i;
		}
			System.out.println("La suma de los números del 1 al 100 es: " + suma);	
		}
}
