package UT02;

public class Ejercicio_1_2 {
	
		String marca;
		int velocidad;
		public void acelerar(int cantidad) {
		velocidad += cantidad;
		}
		public void frenar(int cantidad) {
		velocidad -= cantidad;
		}
		public int getVelocidad() {
		return velocidad;
		}
		
}
