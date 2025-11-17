package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio9_Ficha {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese la primera nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Ingrese la primera nota: ");
		double nota2 = entrada.nextDouble();
		
		System.out.print("Ingrese la primera nota: ");
		double nota3 = entrada.nextDouble();
		
		double promedio = (nota1 + nota2 + nota3)/3;
		if (promedio >=7) {
			System.out.println("Promocio");
		}
	}
}
