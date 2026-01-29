package UT05;

public class Ej1_PodioFormula1 {
	
	public void main(String[] args) {
	/*Declara un array de String llamado pilotos con capacidad para 3 nombres.
	Asigna manualmente (línea a línea) los nombres de los 3 primeros clasificados en una carrera (invéntatelos).
	Imprime por consola: "El ganador es [nombre] y el tercero es [nombre]".
	Reto: Intenta acceder a la posición pilotos[3] y anota en tu cuaderno qué excepción lanza Java.*/
		
		String piloto[]=new String[3];	
		
		piloto[0]="Fernando Alonso";
		piloto[1]="Lewis Hamilton";
		piloto[2]="Max Verstappen";
		piloto[4]="Carlos Sainz";
		
		System.out.println("El ganador es " +piloto[0]+" );
	}
}