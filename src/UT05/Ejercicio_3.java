package UT05;

public class Ejercicio_3 {

    public static void main(String[] args) {

        int[] array = new int[5];

        array[0] = 4;
        array[1] = 7;
        array[2] = 1;
        array[3] = 9;
        array[4] = 2;

        System.out.println("=== ARRAY INICIAL ===");
        mostrarArray(array);

        System.out.println("\nValor en la posición 2:");
        System.out.println(array[2]);

        array[1] = 10;

        System.out.println("\n=== ARRAY DESPUÉS DE MODIFICAR LA POSICIÓN 1 ===");
        mostrarArray(array);
        
        int suma = array[0] + array[4];
        System.out.println("\nSuma de la posición 0 y 4: " + suma);
        
        System.out.println("\n=== RECORRIDO DEL ARRAY CON FOR ===");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + " → " + array[i]);
        }

        System.out.println("\n El último índice válido es array.length - 1");
    }
    
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }
}
