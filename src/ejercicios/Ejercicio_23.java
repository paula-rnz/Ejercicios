package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_23 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String texto;
        do {
            System.out.print("Ingrese una cadena de texto: ");
            texto = input.nextLine();
        } while (texto.isEmpty());

        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isLowerCase(caracter)) {
                resultado += Character.toUpperCase(caracter);
            } else if (Character.isUpperCase(caracter)) {
                resultado += Character.toLowerCase(caracter);
            } else if (Character.isWhitespace(caracter)) {

            } else {
                resultado += caracter;
            }
        }
        
        System.out.println("El resultado es: " + resultado);       
        
	}
}
