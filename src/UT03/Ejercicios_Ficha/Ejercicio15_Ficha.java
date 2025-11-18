package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio15_Ficha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		    // Poblaciones iniciales
		     double poblacionCaceres = 354000;
		     double poblacionBadajoz = 410000;

		    // Tasas de cambio
		     double crecimientoCaceres = 1.0101; // Aumento del 1.01%
		     double decrecimientoBadajoz = 0.9985; // Disminución del 0.15%

		     int anio = 0;

		     System.out.println("Año\tCáceres\t\tBadajoz");

		    // Ciclo hasta que Cáceres supere a Badajoz
		      while (poblacionCaceres <= poblacionBadajoz) {
		      System.out.printf("%d\t%.0f\t\t%.0f\n", anio, poblacionCaceres, poblacionBadajoz);

		      poblacionCaceres *= crecimientoCaceres;
		      poblacionBadajoz *= decrecimientoBadajoz;

		      anio++;
		      }

		  // Mostrar último año ya superado
		      System.out.printf("%d\t%.0f\t\t%.0f\n", anio, poblacionCaceres, poblacionBadajoz);

		      System.out.println("\nLa población de Cáceres supera a la de Badajoz después de " 
		                            + anio + " años.");
		    }

	}
