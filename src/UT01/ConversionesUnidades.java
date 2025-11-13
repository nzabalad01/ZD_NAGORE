package UT01;

import java.util.Scanner;

public class ConversionesUnidades {


		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Introduce la temperatura en grados Celsius: ");
			double celsius = teclado.nextDouble();

			// Formula de conversión.
			double fahrenheit = (celsius*9/5)+32;
			
			System.out.printf("Equivalen a %.2f grados Fahrenheit.",fahrenheit);
			
			
			teclado.close();
		}
	}

