package UT05;

import java.util.Scanner;

public class Ejercicio_3 {

	public void main(String[] args) {
		
	/*Actividad de Aula: "El Array Humano"
	Dinámica: Salen 5 alumnos al encerado. Cada uno representa una posición del array (0, 1, 2, 3, 4).
	Acción: El profesor le da a cada uno un papel con un número secreto.
	Simulación: Otro alumno hace de "Programador" y da instrucciones en voz alta: "Muestra lo que hay en la posición 2", "Suma el valor de la posición 0 y la 4", o "Cambia el valor de la posición 1 por un 10".
	Objetivo: Visualizar que para acceder a un dato, necesitamos señalar a la persona (índice) correcta.*/
	
		Scanner teclado = new Scanner(System.in);

		int[] alumnos = new int[5];
		
		alumnos[0] = 6;
		alumnos[1] = 3;
		alumnos[2] = 9;
		alumnos[3] = 1;
		alumnos[4] = 5;
		
		System.out.println("Muestra lo que hay en la posición 2: " + alumnos[2]);
		
		int suma = alumnos[0] + alumnos[4];
		System.out.println("Suma el valor de la posición 0 y la 4:" + suma);
		
		System.out.println("Cambia el valor de la posición 1 por un 10:");
		alumnos[1] = 10;
		
		System.out.println(alumnos[5]);
		
		for (int i = 0; i < alumnos.length; i++) {
		    System.out.println(alumnos[i]);
		}
		
		}
}

