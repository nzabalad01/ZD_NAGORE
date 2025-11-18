package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio07_Ficha {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un número entre 0 y 99999: ");
		int numero = entrada.nextInt();
		
		if (numero < 0 || numero > 99999) {
			System.out.println("El número no esta en el rango permitido. ");
		}else {
			int cifras = 0;
			int n = numero;
			if (n==0) {
				cifras = 1;
			}else {
				while (n !=0) {
				n/=10;
				cifras++;
			}
		}
		System.out.println("El número tiene " + cifras + " cifras. ");
		}
	}
}
