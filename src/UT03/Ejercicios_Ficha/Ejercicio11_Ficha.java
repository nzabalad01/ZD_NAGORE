package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio11_Ficha {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el peso de la ropa en kilos: ");
		double peso = entrada.nextDouble();
		
		if(peso > 30) {
			System.out.println("Demasiado peso: la lavadora no funcionará.");
		}else if (peso >=22) {
			System.out.println("Nivel de agua: MÁXIMO.");
		}else if (peso >=15) {
			System.out.println("Nivel de agua: ALTO.");
		}else if (peso >=8) {
			System.out.println("Nivel de agua: MEDIO");
		}else {
			System.out.println("Nivel de agua: MÍNIMO");
		}
		
	}

}
