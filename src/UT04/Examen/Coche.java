package UT04.Examen;

public class Coche  extends Vehiculo{
	
	protected int numeroPuertas;
	protected boolean automatico;
	
	public Coche(String marca, int velocidadMaxima, boolean enMarcha, int numeroPuertas, boolean automatico) {
		super(marca, velocidadMaxima, enMarcha);
		this.numeroPuertas = numeroPuertas;
		this.automatico = automatico;
	}

	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Número de puertas: " +numeroPuertas);
		if (automatico == true) {
			System.out.println("Tipo: Automático.");
		} else {
			System.out.println("Tipo: Manual.");
		}
	}


	public void arrancar(String modo) {
		super.arrancar();
		 if (modo == "Llave") {
			 System.out.println("Arrancando el coche con llave.");
		 } else if (modo == "Botón") {
			 System.out.println("Arrancando el coche con botón.");
		 }
	}
	
	
	
	
	
}

