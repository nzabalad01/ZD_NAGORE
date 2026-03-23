package UT06.PruebaEcoMovilAPP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CocheElectrico extends VehiculoElectrico {
	
	int numeroPlazas;
	
	public CocheElectrico(String marca, String modelo, int autonomia, int numeroPlazas) {
		super(marca, modelo, autonomia);
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		super.mostrarInformacion();
		 System.out.println("Número de plazas: " + numeroPlazas);
	}

	@Override
	public void cargar() {
		// TODO Auto-generated method stub
		super.cargar();
	     System.out.println("Cargando coche eléctrico...");
	}
}
