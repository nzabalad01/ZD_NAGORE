package UT05.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ej3_Servidores {
	
	public static void main(String[] args) {
		
		/*Ejercicio 3: Fusión de Servidores
		 * Tienes dos listas de usuarios (Strings):
		 * servidorA: "Juan", "Ana", "Pedro", "Luis"
		 * servidorB: "Ana", "Maria", "Luis", "Sofia".
		 * Se pide:
		 * Crea una tercera lista servidorTotal.
		 * Añade todos los usuarios del A y del B a la nueva lista (investiga addAll).
		 * Reto de Lógica: La lista servidorTotal ahora tiene duplicados (Ana y Luis están dos veces). Escribe un algoritmo que elimine los nombres repetidos (puedes usar una lista auxiliar o investigar si contains te ayuda).
		 * Nota: No vale usar un Set todavía, hazlo "a mano" con lógica de listas.*/
		
		List<String> servidorA = new ArrayList<>();
		
		servidorA.add("Juan");
		servidorA.add("Ana");
		servidorA.add("Pedro");
		servidorA.add("Luis");
		
		List<String> servidorB = new ArrayList<>();
		
		servidorB.add("Ana");
		servidorB.add("María");
		servidorB.add("Luis");
		servidorB.add("Sofía");
		
		List<String> servidorTotal = new ArrayList<>();
		
		servidorTotal.addAll(servidorA);
		servidorTotal.addAll(servidorB);
		
		
		
		System.out.println("Lista con duplicados: ");
		System.out.println(servidorTotal);
		
        ArrayList<String> listaSinDuplicados = new ArrayList<>();

        for (String usuario : servidorTotal) {
            if (!listaSinDuplicados.contains(usuario)) {
                listaSinDuplicados.add(usuario);
            }
        }

        System.out.println("Lista sin duplicados:");
        System.out.println(listaSinDuplicados);
    }
}

