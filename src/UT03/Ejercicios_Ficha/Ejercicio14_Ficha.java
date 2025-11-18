package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio14_Ficha {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un tipo de análisis (1, 2 o 3): ");
		  int tipo = teclado.nextInt();

		    double precio;
		    
		       switch (tipo) {
		           case 1:
		               precio = 25.00;
		               break;
		           case 2:
		               precio = 36.00;
		               break;
		           case 3:
		               precio = 50.00;
		               break;
		           default:
		               precio = -1;
		        }

		        if (precio != -1) {
		            System.out.print("¿El cliente es afiliado? (s/n): ");
		            teclado.nextLine(); // limpiar buffer
		            String afiliado = teclado.nextLine().toLowerCase();

		            double precioFinal = precio;

		            if (afiliado.equals("s")) {
		                precioFinal = precio - precio * 0.08; // descuento del 8%
		            }

		            System.out.println("El precio final del análisis es: " + precioFinal + " €");
		        } else {
		            System.out.println("Tipo de análisis no válido.");
		        }

		        teclado.close();
		   }
		
}
