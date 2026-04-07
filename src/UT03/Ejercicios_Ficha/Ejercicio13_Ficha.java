package UT03.Ejercicios_Ficha;

import java.util.Scanner;

public class Ejercicio13_Ficha {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Bienvenido a ComprobarFecha.");
        System.out.println("Introduce una fecha y te diré si es correcta.");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        System.out.print("Introduce el año: ");
        int año = teclado.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = teclado.nextInt();

        System.out.print("Introduce el día: ");
        int dia = teclado.nextInt();

        boolean fechaCorrecta = false;

        switch (mes) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia >= 1 && dia <= 31) {
                    fechaCorrecta = true;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (dia >= 1 && dia <= 30) {
                    fechaCorrecta = true;
                }
                break;

            case 2:
                boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

                if (esBisiesto) {
                    if (dia >= 1 && dia <= 29) {
                        fechaCorrecta = true;
                    }
                } else {
                    if (dia >= 1 && dia <= 28) {
                        fechaCorrecta = true;
                    }
                }
                break;

            default:
                fechaCorrecta = false;
        }

        if (fechaCorrecta) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha es INCORRECTA.");
        }

        teclado.close();
    }
}