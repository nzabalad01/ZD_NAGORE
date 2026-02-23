package UT05.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej4_Trampa {
	
	public static void main(String[] args) {
	
	/*Crea una lista de enteros con valores: {10, 20, 15, 30, 45, 12}. Queremos borrar todos los números que sean menores de 20.
	
	Intenta hacerlo con un bucle for normal ascendente (i++) y el método remove(i).
	¿Qué ocurre? ¿Se borran todos? (Pista: Al borrar, los índices se desplazan a la izquierda y te saltas elementos).
	Soluciones:
	
	Solución A: Hazlo recorriendo el bucle hacia atrás (i--).
	Solución B (Para nota): Investiga y usa el método moderno lista.removeIf( n -> n < 20 );.*/

	       List<Integer> lista1 = new ArrayList<>(
	               Arrays.asList(10, 20, 15, 30, 45, 12)
	       );
	       
	     
	       for (int i = 0; i < lista1.size(); i++) {
	           if (lista1.get(i) < 20) {
	                lista1.remove(i);
	           }
	       }
	       System.out.println("For ascendente (incorrecto): " + lista1);


	     
	       List<Integer> lista2 = new ArrayList<>(
	               Arrays.asList(10, 20, 15, 30, 45, 12)
	       );

	       for (int i = lista2.size() - 1; i >= 0; i--) {
	           if (lista2.get(i) < 20) {
	               lista2.remove(i);
	           }
	       }
	       System.out.println("For hacia atrás (correcto): " + lista2);


	      
	       List<Integer> lista3 = new ArrayList<>(
	               Arrays.asList(10, 20, 15, 30, 45, 12)
	       );

	       lista3.removeIf(n -> n < 20);
	       System.out.println("removeIf (correcto): " + lista3);
	   }	
}