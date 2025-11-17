package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio8_Ficha {
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.print("Introduce un número entre 0 y 99999: ");
	int numero = entrada.nextInt();
	
	if (numero < 0 || numero > 99999) {
		System.out.println("Número fuera del rango permitidao. ");
	}else {
		if(esCapicua(numero)) {
			System.out.println("El número " + numero + " es capicua.");
		}else {
			System.out.println("El número " + numero + " no es capicua.");
		}
	}
	entrada.close();
	}
	
	public static boolean esCapicua(int n) {
		int original = n;
		int invertido = 0;
		
		while (n!=0);
		int cifra = n % 10;
		invertido = invertido * 10 +cifra;
		n/=10;
	}
	return original == invertido;
	}
}
