package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio16_Ficha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		  int anos;
		  double ahorroAnual;

		  // Validar años hasta jubilación
		  do {
			  System.out.print("Ingrese los años que faltan para su jubilación: ");
		  anos = teclado.nextInt();
		  if (anos <= 0) {
		      System.out.println("El valor debe ser mayor que 0. Intente nuevamente.");
		            }
		 } while (anos <= 0);

		        // Validar dinero ahorrado por año
		   do {
		      System.out.print("Ingrese la cantidad de dinero que puede ahorrar por año: ");
		   ahorroAnual = teclado.nextDouble();
		   if (ahorroAnual <= 0) {
		     System.out.println("El valor debe ser mayor que 0. Intente nuevamente.");
		            }
		 } while (ahorroAnual <= 0);

		        // Cálculo con interés compuesto anual del 4%
		   double total = 0;

		    for (int i = 1; i <= anos; i++) {
		      total += ahorroAnual;   // Aporta el ahorro de este año
		      total *= 1.04;          // Se genera interés del 4%
		    }

		      System.out.println("--------------------------------------------------");
		      System.out.println("El dinero total que tendrá al jubilarse con 4% de interés anual es: $" + total);
		}

}
