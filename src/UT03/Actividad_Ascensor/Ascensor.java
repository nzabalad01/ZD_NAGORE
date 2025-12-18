package UT03.Actividad_Ascensor;

import java.util.Scanner;

public class Ascensor {
	
	private int plantaActual;
	private boolean puertaAbierta;
	
	public Ascensor() {
	
		this.plantaActual = 1;
		this.puertaAbierta = false;
	}
	
	public void marcarPlanta(int plantaMarcada){
		
		if (plantaMarcada < 0 || plantaMarcada > 5) {
			System.out.println("Planta inválida. Debe estar entre 0 y 5.");
            return;
		}
		
		if (puertaAbierta) {
			System.out.println("No se puede mover el ascensor con la puerta abierta. Ciérrela primero.");
            return;
		}
		
		System.out.println("Moviendo hacia la planta " + plantaMarcada + "...");
		
		while (plantaActual < plantaMarcada) {
			subir();
		}
		
		while (plantaActual > plantaMarcada) {
			bajar();
		}
		
		System.out.println("Ascensor detenido en la planta " + plantaActual);
	}
		
		public void abrirPuerta(){
			if(puertaAbierta) {
				System.out.println("La puerta ya está abierta");
			}else {
				puertaAbierta = true;
				System.out.println("Puerta abierta");
			}
		}
			
		public void cerrarPuerta() {
			if(!puertaAbierta) {
				System.out.println("La puerta ya está cerrada");
			}else {
				puertaAbierta = false;
				System.out.println("Puerta cerrada");	
			}
		}
		
		public void subir() {
			if(plantaActual < 5) {
				plantaActual++;
				System.out.println("Subiendo... Ahora estas en la planta." + plantaActual );
			}
		}

		public void bajar() {
			if(plantaActual > 0) {
				plantaActual--;
				System.out.println("Bajando... Ahora estas en la planta" + plantaActual);
			}
		}
		
		public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Ascensor asc = new Ascensor();
	        int opcion;

	        do {
	            System.out.println("------ PANEL DE CONTROL DEL ASCENSOR ------");
	            System.out.println("Planta actual: " + asc.plantaActual + " | Puerta " + (asc.puertaAbierta ? "abierta" : "cerrada"));
	            System.out.println("1. Marcar planta");
	            System.out.println("2. Abrir puerta");
	            System.out.println("3. Cerrar puerta");
	            System.out.println("4. Apagar");
	            System.out.print("Seleccione una opción: ");
	            opcion = sc.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.print("Ingrese la planta (0-5): ");
	                    int p = sc.nextInt();
	                    asc.marcarPlanta(p);
	                    break;

	                case 2:
	                    asc.abrirPuerta();
	                    break;

	                case 3:
	                    asc.cerrarPuerta();
	                    break;

	                case 4:
	                    System.out.println("👋 Apagando el ascensor. ¡Adiós!");
	                    break;

	                default:
	                    System.out.println("❌ Opción inválida.");
	            }

	        } while (opcion != 4);

	        sc.close();
	    }
	}
