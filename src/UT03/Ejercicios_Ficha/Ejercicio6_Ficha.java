package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio6_Ficha {

	public static void main(String[] args) {
		/*Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje
		 * indicando si el número tiene uno o dos dígitos.(Tener en cuenta que condición debe
		 * cumplirse para tener dos dígitos, un número entero).*/
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número positivo entre 1...99");
		int num1 = entrada.nextInt();
		
		if (num1 > 1 || num1 < 99) {
			System.out.println("El número debe estar entre 1 y 99");	
		} else {
			if (num1 < 10) {
				System.out.println("El número tiene  1 dígito ");
		} else {
			System.out.println("El número tiene 2 dígitos ");
		}
	} 
	
	}
	
}
