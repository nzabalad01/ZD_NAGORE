package UT06.PruebaEcoMovilAPP;

public class PatineteElectrico extends VehiculoElectrico{
	
	 int potenciaMotor;

	 public PatineteElectrico(String marca, String modelo, int autonomia, int potenciaMotor) {
		super(marca, modelo, autonomia);
		this.potenciaMotor = potenciaMotor;
	 }

	 @Override
	 public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		System.out.println("Potencia del motor: " + potenciaMotor + " W");
	 }

	 @Override
	 public void cargar() {
		// TODO Auto-generated method stub
		super.cargar();
		  System.out.println("Cargando patinete eléctrico...");
	 }
}
