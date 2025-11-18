package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio05_Ficha {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer número : ");
		int num1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo número : ");
		int num2 = entrada.nextInt();
		
		if (num1 > num2) {
			System.out.println( num1 + num2);
		} else {
			System.out.println( num1 * num2);
		}
		
	}
}
