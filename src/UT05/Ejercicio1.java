package UT05;

import java.util.Scanner;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class Ejercicio1 {
	/*Ejercicio 1: El Escáner de Precios
	Crea un programa que pida al usuario el precio de 4 productos de una tienda de informática.
	Almacena los precios en un array de tipo double.
	Calcula el precio total (suma de todos).
	Muestra el precio medio.*/
	
	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);
		 	
		 double[] precio = new double[4];
		
		 
		 System.out.println("Introduce el precio 1");
		 precio[1]=teclado.nextDouble();
		 teclado.nextLine();
		 System.out.println("Introduce el precio 2");
		 precio[2]=teclado.nextDouble();
		 teclado.nextLine();
		 System.out.println("Introduce el precio 3");
		 precio[3]=teclado.nextDouble();
		 teclado.nextLine();
		 System.out.println("Introduce el precio 4");
		 precio[4]=teclado.nextDouble();
		 teclado.nextLine();
	}
}