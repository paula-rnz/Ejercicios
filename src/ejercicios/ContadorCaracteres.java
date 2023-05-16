package ejercicios;
import java.util.ArrayList;
import java.util.Scanner;
	
public class ContadorCaracteres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;
        do {
            System.out.print("Ingrese una cadena de texto: ");
            texto = scanner.nextLine().trim();
        } while (texto.isEmpty());
        // valido que no hayan espacios vacios a traves de .trim()
        
        
        char[] arreglo = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            arreglo[i] = texto.charAt(i);
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        
        
        
        
        int[] conteoLetras = new int[27];
        for (int i = 0; i < arreglo.length; i++) {
        	char letra = Character.toLowerCase(arreglo[i]);
            if (letra >= 'a' && letra <= 'n') {
            	int indice = letra - 'a';
                conteoLetras[indice]++;
            }
            if (letra >= 'o' && letra <= 'z') {
            	int indice = letra - 'a' + 1;
                conteoLetras[indice]++;
            }
            if (letra == 'ñ') {
            	int indice = 14;
                conteoLetras[indice]++;
            }
        }

        for (char letra = 'a'; letra <= 'n'; letra++) {
        	int indice = letra - 'a';
            System.out.println(letra + ": " + conteoLetras[indice]);
        }
        System.out.println("ñ: " + conteoLetras[14]);
        for (char letra = 'o'; letra <= 'z'; letra++) {
        	int indice = letra - 'a' + 1;
            System.out.println(letra + ": " + conteoLetras[indice]);
        }
	}

}


