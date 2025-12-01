package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio21_Ficha {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Tipo de vehiculo (P=pequeño, M=mediano, G=grande): ");
		String tipo = teclado.nextLine().toUpperCase();
				
		System.out.println("Kilometros a recorrer: ");
		double km = teclado.nextDouble();
					
		double precioDia = 0;
		double precioKm = 0;
					
		if(tipo.equals("P")) {
			precioDia = 15;
			precioKm = 0.20;
		}else if(tipo.equals("M")) {
			precioDia = 20;
			precioKm = 0.30;
		}else if(tipo.equals("G")) {
			precioDia = 30;
			precioKm = 0.40;
		}else {
			System.out.println("Tipo de vehículo no valido");
			return;
		}
		double total = precioDia + precioKm * km;
				
		if (km>10) {
			total = total *1.025;
		}
					
		System.out.println("El coste del alquiler es:"+ total +"€");
				
		teclado.close();
	}
	
}


