package UT04.Apdo9_Ej1.Apdo9_Ej2;

public class Vehiculo {
	
	private int velocidad=0;
	
	public void acelerar(int aceleracion) {
		velocidad=velocidad+aceleracion;
	}
	
	public void frenar(int frenada) {
		velocidad=velocidad-frenada;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	

}