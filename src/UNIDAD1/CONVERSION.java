package UNIDAD1;

public class CONVERSION {
	
	public static void main(String{} args) {

	/*Escribe un programa que pida un número de grados Calsius y 
	 * los convierta a Fahrenhelt, mostando el resultado.
	 */
	System.out.prinln("Intruduce la temperatura en grados Celsius: ");
	double celsius = teclado.nextDouble();
	
	//Formula de conversión.
	double fahrenherlt = (celsius*9/5)+32;
	
	System.out.printf("Equivalen a %.2f grados Fahrenhelt.", fahrenherlt);
}
}
