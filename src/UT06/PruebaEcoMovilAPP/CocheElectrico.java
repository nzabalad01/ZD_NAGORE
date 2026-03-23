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
	
	public class EcoMovilApp {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<VehiculoElectrico> lista = new ArrayList<>();

	        int contBicis = 0, contPatinetes = 0, contCoches = 0;
	        int opcion;

	        do {
	            System.out.println("\n--- MENÚ ---");
	            System.out.println("1. Agregar bicicleta eléctrica");
	            System.out.println("2. Agregar patinete eléctrico");
	            System.out.println("3. Agregar coche eléctrico");
	            System.out.println("4. Mostrar vehículos");
	            System.out.println("5. Cargar vehículos");
	            System.out.println("6. Salir");
	            System.out.print("Elige una opción: ");
	            opcion = sc.nextInt();
	            sc.nextLine(); // limpiar buffer

	            switch (opcion) {
	                case 1:
	                    if (contBicis >= 5) {
	                        System.out.println("Error: máximo 5 bicicletas.");
	                        break;
	                    }
	                    System.out.print("Marca: ");
	                    String marcaB = sc.nextLine();
	                    System.out.print("Modelo: ");
	                    String modeloB = sc.nextLine();
	                    System.out.print("Autonomía: ");
	                    int autoB = sc.nextInt();
	                    System.out.print("¿Tiene pedales? (true/false): ");
	                    boolean pedales = sc.nextBoolean();

	                    lista.add(new BicicletaElectrica(marcaB, modeloB, autoB, pedales));
	                    contBicis++;
	                    break;

	                case 2:
	                    if (contPatinetes >= 5) {
	                        System.out.println("Error: máximo 5 patinetes.");
	                        break;
	                    }
	                    System.out.print("Marca: ");
	                    String marcaP = sc.nextLine();
	                    System.out.print("Modelo: ");
	                    String modeloP = sc.nextLine();
	                    System.out.print("Autonomía: ");
	                    int autoP = sc.nextInt();
	                    System.out.print("Potencia (W): ");
	                    int potencia = sc.nextInt();

	                    lista.add(new PatineteElectrico(marcaP, modeloP, autoP, potencia));
	                    contPatinetes++;
	                    break;

	                case 3:
	                    if (contCoches >= 5) {
	                        System.out.println("Error: máximo 5 coches.");
	                        break;
	                    }
	                    System.out.print("Marca: ");
	                    String marcaC = sc.nextLine();
	                    System.out.print("Modelo: ");
	                    String modeloC = sc.nextLine();
	                    System.out.print("Autonomía: ");
	                    int autoC = sc.nextInt();
	                    System.out.print("Número de plazas: ");
	                    int plazas = sc.nextInt();

	                    lista.add(new CocheElectrico(marcaC, modeloC, autoC, plazas));
	                    contCoches++;
	                    break;

	                case 4:
	                    System.out.println("\n--- VEHÍCULOS ---");
	                    Iterator<VehiculoElectrico> it = lista.iterator();
	                    while (it.hasNext()) {
	                        VehiculoElectrico v = it.next();
	                        v.mostrarInformacion(); // polimorfismo
	                        System.out.println("------------------");
	                    }
	                    break;

	                case 5:
	                    System.out.println("\n--- CARGANDO VEHÍCULOS ---");
	                    Iterator<VehiculoElectrico> it2 = lista.iterator();
	                    while (it2.hasNext()) {
	                        VehiculoElectrico v = it2.next();
	                        v.cargar(); // polimorfismo
	                    }
	                    break;

	                case 6:
	                    System.out.println("Saliendo del programa...");
	                    break;

	                default:
	                    System.out.println("Opción inválida.");
	            }

	        } while (opcion != 6);

	        sc.close();
	    }
	}
}
