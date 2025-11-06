package UT03;

import java.util.Scanner;

public class Ejercicio3_Apdo2_8 {

	
	public static void main(String[] args) {
		int suma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número y calcularé la suma total " 
				+ "(para terminar Introduce un 0): ");
		int numero = teclado.nextInt();
		while (numero!=0) {
			suma= suma+numero;
			numero = teclado.nextInt();
		}
		System.out.println("La suma de todos los números introducidos es:: " + suma);
		teclado.close();
	}
}	

