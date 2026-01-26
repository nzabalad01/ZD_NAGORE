package UT04.Examen;

public class Main {

	public static void main(String[] args) {
		
		Vehiculo v1 = new Vehiculo("Peugeot",250,true);
		Vehiculo v2 = new Vehiculo("Audi");
		
		Coche coche1 = new Coche("Mercedes",200,false,5,true);
		Moto moto1 = new Moto("Yamaha",120,1000,false);
		
		v1.setEnMarcha(false);
		v2.setVelocidadMaxima(140);
		coche1.setMarca("Ford");
		moto1.setVelocidadMaxima(200);
		
		moto1.getMarca();
		
		v1.mostrarDatos();
		System.out.println("-----------------");
		v2.mostrarDatos();
		System.out.println("-----------------");
		coche1.mostrarDatos();
		System.out.println("-----------------");
		moto1.mostrarDatos();
		
		System.out.println("================================");
	
		
		v1.arrancar();
		System.out.println("----------------------------");
		coche1.arrancar("Llave");
		System.out.println("-----------------------------");
		moto1.arrancar(true);
		moto1.arrancar(false);
		
		
	}
	
	

}
