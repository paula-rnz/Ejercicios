package ejercicios;

import java.util.Scanner;

public class VerificadorContrasena {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String contrasena;
        String contasenaCoder = "belcebu";


        int contador = 0;

        for (int i = 0; i < 3 ; i++) {
            
        	do {
            System.out.print("Introdusca la contraseña:");
            contrasena = input.nextLine();
            }  while (contrasena.isEmpty());
             
            if (contrasena.equals(contasenaCoder)) {
            	contador++;
            	i = 3;
            }
        }
        
        if (contador == 1) {
        	 System.out.println("\n“La clave ingresada es correcta”" );
        }else{
        	System.out.println("\n“Ninguna de las claves ingresadas es correcta”" );
        }
        	
	}
}
