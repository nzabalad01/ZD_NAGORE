package UT03;

import java.util.Scanner;

public class NumeroSigno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String palabra;
		do {
			System.out.println("Introduce una palabra: ");
			palabra=teclado.nextLine();
		
			if((palabra.contains("x")) || (palabra.contains("X"))) {
					continue;
			}
			System.out.println("Tu palabra no contiene 'x' -> "+palabra);
		}while (!palabra.equals("salir"));
		System.out.println("Has introducido 'salir'...adiós!");
	}
}


