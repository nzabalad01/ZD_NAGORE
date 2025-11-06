package UT03;

import java.util.Scanner;

public class Ejercio1_Apdo1_7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce número");
		int número = teclado.nextInt();
		
		if (número>0) {
			 System.out.println("El número introducido es positivo");
			} else if (número==0) {
			 System.out.println("El número introducido es igual a 0");
			} else if (número<0) {
			 System.out.println("El número introducido es negativo");
			} 
			
		teclado.close();
		
		}
	
	}
		



