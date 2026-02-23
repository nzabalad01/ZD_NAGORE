package UT05.Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej5_Biblioteca {

	public static void main(String[] args) {
	
	/*En el main:
	Crea una ArrayList<Videojuego> y añade 4 juegos distintos.
	Búsqueda: Pide al usuario un título por teclado. Busca si existe en la lista.
	Si existe: Muestra sus datos y sus horas jugadas.
	Si no existe: Muestra "Juego no encontrado".
	Modificación: Busca todos los juegos de la plataforma "Xbox" y súmales 10 horas extra a sus horasJugadas.
	Filtrado: Crea una nueva lista llamada juegosPasados. Recorre la original y copia en esta nueva lista solo aquellos juegos que tengan más de 100 horas.*/

		        // Crear la biblioteca de Steam
		        ArrayList<Videojuego> biblioteca = new ArrayList<>();

		        biblioteca.add(new Videojuego("Elden Ring", "PC", 120));
		        biblioteca.add(new Videojuego("Halo Infinite", "Xbox", 60));
		        biblioteca.add(new Videojuego("The Witcher 3", "PC", 200));
		        biblioteca.add(new Videojuego("Forza Horizon 5", "Xbox", 80));

		        Scanner sc = new Scanner(System.in);

		        // BÚSQUEDA POR TÍTULO
		        System.out.print("Introduce el título del juego a buscar: ");
		        String tituloBuscado = sc.nextLine();

		        boolean encontrado = false;

		        for (Videojuego v : biblioteca) {
		            if (v.getTitulo().equalsIgnoreCase(tituloBuscado)) {
		                System.out.println("Juego encontrado:");
		                System.out.println(v);
		                System.out.println("Horas jugadas: " + v.getHorasJugadas());
		                encontrado = true;
		                break;
		            }
		        }

		        if (!encontrado) {
		            System.out.println("Juego no encontrado");
		        }

		        // MODIFICACIÓN: sumar 10 horas a juegos de Xbox
		        for (Videojuego v : biblioteca) {
		            if (v.getPlataforma().equalsIgnoreCase("Xbox")) {
		                v.setHorasJugadas(v.getHorasJugadas() + 10);
		            }
		        }

		        // FILTRADO: juegos con más de 100 horas
		        ArrayList<Videojuego> juegosPasados = new ArrayList<>();

		        for (Videojuego v : biblioteca) {
		            if (v.getHorasJugadas() > 100) {
		                juegosPasados.add(v);
		            }
		        }

		        // Mostrar juegos filtrados
		        System.out.println("\nJuegos con más de 100 horas:");
		        for (Videojuego v : juegosPasados) {
		            System.out.println(v);
		        }

		        sc.close();
		    }
		}

		// CLASE VIDEOJUEGO
		class Videojuego {

		    private String titulo;
		    private String plataforma;
		    private int horasJugadas;

		    public Videojuego(String titulo, String plataforma, int horasJugadas) {
		        this.titulo = titulo;
		        this.plataforma = plataforma;
		        this.horasJugadas = horasJugadas;
		    }

		    public String getTitulo() {
		        return titulo;
		    }

		    public String getPlataforma() {
		        return plataforma;
		    }

		    public int getHorasJugadas() {
		        return horasJugadas;
		    }

		    public void setTitulo(String titulo) {
		        this.titulo = titulo;
		    }

		    public void setPlataforma(String plataforma) {
		        this.plataforma = plataforma;
		    }

		    public void setHorasJugadas(int horasJugadas) {
		        this.horasJugadas = horasJugadas;
		    }

		    @Override
		    public String toString() {
		        return "Videojuego{" +
		                "titulo='" + titulo + '\'' +
		                ", plataforma='" + plataforma + '\'' +
		                ", horasJugadas=" + horasJugadas +
		                '}';
		    }	
}
