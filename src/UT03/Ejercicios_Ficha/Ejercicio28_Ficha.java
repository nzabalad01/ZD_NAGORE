package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio28_Ficha {
	/*Crea un método validarContraseña(String pass) que lance una excepción si la longitud
	es menor a 8 caracteres. Además, deberá comprobar lo siguiente:
	✓ La cadena tiene 8 o más caracteres.
	✓ Contiene al menos una minúscula.
	✓ Contiene al menos una mayúscula.
	✓ Contiene al menos un número.
	✓ Contiene al menos un carácter especial (-, _ o $)
	o Tras introducir la cadena mostrará un mensaje donde indicará si la cadena es
	correcta, si tiene un número inferior a 8 caracteres o si no cumple con los 4
	últimos requisitos.*/
	public class validarContraseña{
		Scanner teclado = new Scanner (System.in);
		
		String cadena;
		
		int longitud = cadena.length();
		if(longitud<=8) {
			System.out.println();
		}else {
			System.out.println("Contraseña demasiado corta, Introducta una contraseña de 8 o más caracteres")
		}


		
	



