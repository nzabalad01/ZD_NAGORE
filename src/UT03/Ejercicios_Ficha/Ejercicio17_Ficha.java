package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio17_Ficha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Seleccione el tipo de pienso (A, B o C): ");
		String tipo = teclado.nextLine();

		double precio;

        switch (tipo) {
            case "A":
                precio = 0.30;
                System.out.println("El precio del pienso tipo A es: " + precio + " €/kg");
                break;

            case "B":
                precio = 0.20;
                System.out.println("El precio del pienso tipo B es: " + precio + " €/kg");
                break;

            case "C":
                precio = 0.15;
                System.out.println("El precio del pienso tipo C es: " + precio + " €/kg");
                break;

            default:
                System.out.println("Error: opción no válida.");
        }

        teclado.close();
    }
}     