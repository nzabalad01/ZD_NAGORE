package UT03;

import java.util.Scanner;

public class Ejercicio2_Apdo2_8 {


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Introduce un número: ");
			int numero = scanner.nextInt();
			int factorial = 1;
			for (int n = 1; n <= numero; n++) {
				factorial *= n;
			}
			System.out.println("El factorial de " + numero + " es igual a: " + factorial);
	}
}

