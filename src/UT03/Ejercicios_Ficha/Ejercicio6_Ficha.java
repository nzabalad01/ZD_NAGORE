package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio6_Ficha {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número positivo entre 1...99: ");
		int num1 = entrada.nextInt();
		
		if (num1 >= 1 || num1 <= 9) {
			System.out.println("El número tiene un dígito. ");	
		} else if (num1 >= 10 || num1 <= 99) {
				System.out.println("El número tiene  2 dígitos. ");
		} else {
			System.out.println("El número no está entre el 1 y el 99. ");
		}
	} 
	
	}
	

