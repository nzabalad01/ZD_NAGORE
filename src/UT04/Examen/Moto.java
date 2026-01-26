package UT04.Examen;

public class Moto extends Vehiculo {
	
	protected int cilindrada;
	protected boolean tipo;
	
	public Moto(String marca, int velocidadMaxima, int cilindrada, boolean tipo) {
		super(marca);
		this.cilindrada = cilindrada;
		this.tipo = tipo;
	}
	
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Cilindrada: " +cilindrada);
		
		if (tipo == true) {
			System.out.println("Tipo: Deportiva.");
		} else {
			System.out.println("Tipo: Scooter.");
		}
	}

	public void arrancar(boolean caballete) {
		super.arrancar();
		if (caballete == true) {
			System.out.println("No se puede arrancar la moto con el caballete puesto.");
		} else {
			System.out.println("La moto ha arrancado correctamente.");
		}
	}
}
