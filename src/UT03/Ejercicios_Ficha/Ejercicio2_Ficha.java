package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio2_Ficha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el primer número: ");
		int num2 = sc.nextInt();
		
		if(num1 >= num2) {
			System.out.println("Orden decreciente; "+ num1 +", " + num2);
		}else {
			System.out.println("Orden decreciente: " +num2 +", "+ num1);
		
		}
		
	}
}
