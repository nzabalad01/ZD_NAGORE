package UT03.Ejercicios_Ficha;

import java.util.Scanner; 

public class Ejercicio13_Ficha {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("Bienvenido a ComprobarFecha. "
				+ "Introduce una fecha y te diré si es correcta.");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("Introduce el año: ");
		int año = teclado.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = teclado.nextInt();
		System.out.println("Introduce el dia: ");
		int dia = teclado.nextInt();
		
		switch(mes) {
		
		case 1,3,5,7,8,10,12:
			if (dia>=1 && dia<=31) {
				System.out.println("La fecha es correcta.");
			} else {
				System.out.println("La fecha es INCORRECTA.");
			}
			break;
		case 4,6,9,11:
			if (dia>=1 && dia<=30) {
				System.out.println("La fecha es correcta.");
			}else {
				System.out.println("La fecha es INCORRECTA.");
			}
			break;
		case 2:
			if (año % 4 ==0) {
				// Si el año es bisiesto.
				if (dia>=1 && dia<=29) {
					System.out.println("La fecha es correcta.");
				}else {
						System.out.println("La fecha es INCORRECTA.");
				}
			} else if (dia>=1 && dia<=28) {
				//Si no es año bisiesto.
					System.out.println("La fecha es correcta.");
			} else {
				System.out.println("La fecha es INCORRECTA.");
			}
			break;
		}
		teclado.close();
	}

}

