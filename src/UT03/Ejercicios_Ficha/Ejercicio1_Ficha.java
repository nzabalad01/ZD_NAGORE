package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio1_Ficha {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
		scanner.close();
	}
}
