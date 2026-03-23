package UT06.PruebaEcoMovilAPP;

public class BicicletaElectrica extends VehiculoElectrico{

	   boolean tienePedales;

	   public BicicletaElectrica(String marca, String modelo, int autonomia) {
		super(marca, modelo, autonomia);
		 this.tienePedales = tienePedales;
		// TODO Auto-generated constructor stub
	   }

	   @Override
	   public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		 System.out.println("Tiene pedales: " + (tienePedales ? "Sí" : "No"));
	   }

	   @Override
	   public void cargar() {
		// TODO Auto-generated method stub
		super.cargar();
	   }
}
