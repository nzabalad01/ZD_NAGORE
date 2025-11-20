package UT03.Ejercicios_Ficha;

import java.util.Scanner; 

public class Ejercicio18_Ficha {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		int num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		int num2 = teclado.nextInt();
		
		System.out.println("---   M  E  N  U   ---");
		System.out.println("S = suma");
		System.out.println("R = resta");
		System.out.println("M = multiplicación");
		System.out.println("D = división");
		System.out.println("Elija una opción (S/R/M/D) y enter: ");
		String opcion = teclado.next();
		
		switch (opcion) {
        case "S":
            System.out.println("Resultado de la suma: " + (num1 + num2));
            break;

        case "R":
            System.out.println("Resultado de la resta: " + (num1 - num2));
            break;

        case "M":
            System.out.println("Resultado de la multiplicación: " + (num1 * num2));
            break;
            
        case "D":
            System.out.println("Resultado de la división: " + (num1 / num2));
            
            if (num2 != 0) {
                System.out.println("Resultado de la división: " + ((double) num1 / num2));
            } else {
                System.out.println("No se puede dividir entre cero.");
            }
            break;
            
        default:
            System.out.println("Opción no válida.");
    }

    teclado.close();
	}

}
