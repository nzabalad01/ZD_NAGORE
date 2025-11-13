package UT03.Apdo3_7;

import java.util.Scanner;

public class Ejercicio3_Apdo3_7 {

	
	public static int cuadrado(int n) {
		if (n<0) {
			return -1;
		} else {
			return (n*n);
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número para calcular su cuadrado: ");
		int n = teclado.nextInt();
		int resultado = cuadrado(n);
		if (resultado<0) {
			System.out.println("No se puede calcular el cuadrado de un número negativo. ");
		} else {
			System.out.println(resultado);
		}

	}

}
