package UT04.Apdo11.Ej1;

import UT04.Apdo11.Ej1.Procesador;

public class Ordenador {

		Procesador proc;
		double memoria;
		double discoDuro;
		String grafica;
			
		public Ordenador(double memoria, double discoDuro, String grafica, double velocidad, int nucleos) {
			this.memoria=memoria;
			this.discoDuro=discoDuro;
			this.grafica=grafica;
			this.proc = new Procesador(velocidad, nucleos);			
		}
		
		//Otro posible constructor sería recibiendo un objeto Procesador
		public Ordenador(double memoria, double discoDuro, String grafica, Procesador p) {
			this.memoria=memoria;
			this.discoDuro=discoDuro;
			this.grafica=grafica;
			this.proc = p;			
		}

		public void mostrarInfo() {
			System.out.println("Memoria=" + memoria + "GB "+", DiscoDuro=" + discoDuro + "TB "+", grafica="
					+ grafica);
			proc.mostrarInfo();
		}
}
