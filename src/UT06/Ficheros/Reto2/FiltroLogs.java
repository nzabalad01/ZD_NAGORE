package UT06.Ficheros.Reto2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FiltroLogs {

    public static void main(String[] args) {

        int contadorErrores = 0;

        try (
            BufferedReader br = new BufferedReader(
                new FileReader("./src/UT06/Ficheros/Reto2/server.log"));
            
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("./src/UT06/Ficheros/Reto2/alertas_urgentes.txt"))
        ) {

            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains("[ERROR]") || linea.contains("[CRITICAL]")) {
                    bw.write(linea);
                    bw.newLine(); 
                    contadorErrores++;
                }
            }
            System.out.println("Se han exportado " + contadorErrores + " errores graves.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
