package UT04.Examen;

public class Vehiculo {

	protected String marca;
	protected int velocidadMaxima;
	protected boolean enMarcha;
	
	public Vehiculo(String marca, int velocidadMaxima, boolean enMarcha) {
		super();
		this.marca = marca;
		this.velocidadMaxima = velocidadMaxima;
		this.enMarcha = enMarcha;
	}

	public Vehiculo(String marca) {
		super();
		this.marca = marca;
		this.velocidadMaxima = 120;
		this.enMarcha = false;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public boolean isEnMarcha() {
		return enMarcha;
	}

	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}

	public void arrancar() {
		enMarcha = true;
		System.out.println("El vehículo ha arrancado.");
	}
	
	public void detener() {
		enMarcha = false;
		System.out.println("El vehículo se ha detenido");
	}
	
	public void mostrarDatos() {
		System.out.println("Marca: " +marca);
		System.out.println("Velocidad máxima: " +velocidadMaxima);
		if (enMarcha == true) {
			System.out.println("Estado: En marcha");
		} else {
			System.out.println("Estado: Detenido");
		}
	}	
}
