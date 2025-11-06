package UT03;

import java.util.Scanner;

public class Ejercicio3_Apdo1_7 {
	
	public static void main(String[] args) {
	
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Introduce la nota del alumno: ");
			int nota = teclado.nextInt();
			
			if (nota>=9) {
				System.out.println("La calificación final es de SOBRESALIENTE.");
		} else if (nota>=7) {
				System.out.println("La calificación final es de NOTABLE.");
		} else if (nota>=5) {
				System.out.println("La calificación final es de APROBADO.");
		} else {
				System.out.println("La calificación final es de SUSPENSO.");
			}
			
			
			teclado.close();
			}
		}

