package UNIDAD1;

public class Ejemplo1 {
		public static void main(String[] args) {
		// Enteros
		int edad = 20;
		long poblacion = 47002200L;
		int contador=0;
		contador=9;
		contador=contador-3;
		// Decimales
		float precio = 9.49f;
		double pi = 3.1415926535;
		// Carácter
		char inicial = 'A';
		// Booleano
		boolean aprobado = true;
		System.out.println("Edad: " + edad);
		System.out.println("Población: " + poblacion);
		System.out.println("Precio: " + precio);
		System.out.println("PI: " + pi);
		System.out.println("Inicial: " + inicial);
		System.out.println("¿Aprobado? " + aprobado);
		System.out.println("Contador: "+ contador);
		
		int iva = 21;
		double precios = 100;
		System.out.println("El precio sin iva es:"+ precios);
		System.out.println("IVA:" +iva);
		precios=precios+(precios*iva/100);
		
		
	
		}
		
}
