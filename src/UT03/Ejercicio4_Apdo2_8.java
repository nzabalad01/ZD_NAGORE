package UT03;

import java.util.Scanner;

public class Ejercicio4_Apdo2_8 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcion;
	
		do {
			System.out.println("Introduce: \n Pulsa 1 para Seguir \n 2 para Salir");
			opcion=teclado.nextInt();
		} while(opcion!=2);
		System.out.println("Saliendo del menú... adiós!!");
		
	}	
}
