package UT06.Ficheros;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ChatLog {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // try-with-resources para asegurar el cierre automático del archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("historial.txt", true))) {

            while (true) {
                System.out.print("Escribe un mensaje: ");
                String mensaje = scanner.nextLine();

                // Comprobar si el usuario quiere salir
                if (mensaje.equalsIgnoreCase("FIN")) {
                    break;
                }

                // Escribir el mensaje en el archivo
                writer.write(mensaje);
                writer.newLine(); // salto de línea
            }

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        scanner.close();
        System.out.println("Programa finalizado.");
    }
}