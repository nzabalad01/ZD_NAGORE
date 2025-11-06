package UT03;

import java.util.Scanner;

public class NumeroSigno {

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
		



