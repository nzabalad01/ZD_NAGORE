package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio15_Ficha {

	public static void main(String[] args) {
		double caceres = 354000;
		double badajoz = 410000;
		
		double aumento=1.01;
		double reduccion = 0.05;
		
		int años=1;
		
		while(caceres<=badajoz) {
			System.out.println("Año: "+años);
			caceres = caceres+(caceres*aumento/100);
			badajoz = badajoz-(badajoz*reduccion/100);
			System.out.println("La población de Cáceres es: "+caceres);
			System.out.println("La población de Badajoz es: "+badajoz);
			años++;
		}
	}

}
