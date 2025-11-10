package UT03;

import java.util.Scanner;

public class Ejercicio1_Apdo2_9 {

	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		int numero=0;
		
		System.out.println("Introduce un número para calcular su tabla de multiplicar: ");
		numero=teclado.nextInt();
		System.out.println("La tabla de multiplicar del "+numero+" es la siguiente: ");
		for (int i=1; i<=10; i++) {
			System.out.println(numero+ " x " +i+ " es igual a " +numero*i);
		}
	}
}
