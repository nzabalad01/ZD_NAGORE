package UT03;

import java.util.Scanner;

public class Ejercico3_Apdo2_9 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	String contraseña = "abracadabra";
	int intentos=0;
	boolean acierto=false;
	
	System.out.println("Introduce la contraseña: ");
	String palabra = teclado.nextLine();
	
	while ((!acierto) && (intentos < 4)){
		System.out.println("Introduce la contraseña:");
		String palabra1 = teclado.nextLine();
		
		if (palabra.equalsIgnoreCase(contraseña)){
			acierto = true;
			System.out.println("Enhorabuena! Has acertado!");
		} else {
			System.out.println("Has fallado! Intentalo otra vez: ");
			intentos++;
		}
	}
	System.out.println("F I N.");
	
	teclado.close();
	}
	}
