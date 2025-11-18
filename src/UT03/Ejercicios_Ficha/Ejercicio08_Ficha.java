package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio08_Ficha {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero=teclado.nextInt();
		int original=numero;
		int cifras=1;
		int inverso=0;
		
		while(numero>10) {
			inverso=(inverso*10)+numero%10;
			numero=numero/10;
			cifras++;
		}
		
		inverso=(inverso*10)+numero%10;
		
		if (inverso == original) {
			System.out.println("El número es capicúa.");
		} else {
			System.out.printf("El número al revés es %d y por lo tanto no es capicúa.",inverso);
			
		}

	}

}
