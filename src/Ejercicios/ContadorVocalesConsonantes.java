package Ejercicios;

import java.util.Scanner;

public class ContadorVocalesConsonantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String texto;
        do {
            System.out.print("Ingrese una cadena de texto: ");
            texto = input.nextLine().toLowerCase();
        } while (texto.isEmpty());

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if ((letra >= 'a' && letra <= 'z')|| letra == 'ñ') {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
            System.out.print(letra + " ");
        }

        System.out.println("\nCantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);
    }
}
