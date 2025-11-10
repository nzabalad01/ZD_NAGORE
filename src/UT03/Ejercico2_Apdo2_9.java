package UT03;

import java.util.Scanner;

public class Ejercico2_Apdo2_9 {

	public static void main(String[]args);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Intreoduce una palabra. Contaré cuantas "a" contiene: ");
		String palabra = teclado.nextLine();
		
		for (int i=0; i<palabra.length(); i++) {
			if( palabra.charAt(i)=="a") {
					contador++;
			}
		}
		System.out.println("La letra "a" se repite "+contador+" veces. ");
		teclado.close();
	}
}
