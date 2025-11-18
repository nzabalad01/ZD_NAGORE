package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio03_Ficha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("El numero mayor es : "+num1);
		} else {
			System.out.println("El numero mayor es : "+num2);
		
		}			
	}
}
