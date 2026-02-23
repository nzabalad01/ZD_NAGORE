package UT05.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ej1_Playlist {
	
	public static void main(String[] args) { 
		
	/*Crea una ArrayList<String> llamada playlist.

	Añade manualmente 5 canciones (Títulos).
	Imprime la lista completa.
	Te has equivocado: la canción de la posición 2 no te gusta. Cámbiala por "Despacito" usando set().
	La primera canción ya la has escuchado. Elimínala.
	Imprime: "Actualmente hay [n] canciones en la cola".*/
	
	List<String> playlist = new ArrayList<>();
	
	playlist.add("Esclava");
	playlist.add("Lo que tiene");
	playlist.add("Como están");
	playlist.add("Yonaguni");
	playlist.add("NuevaYol");
	
	System.out.println(playlist);
	
	playlist.set(1, "Despacito");
	
	System.out.println(playlist);
	
	playlist.remove(0);
	
	System.out.println(playlist);
	
	System.out.println("Actualmente hay " + playlist.size() + " canciones en la cola");

	
	
}
}
