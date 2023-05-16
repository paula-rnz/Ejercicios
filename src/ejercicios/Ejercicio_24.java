package ejercicios;

import java.util.Scanner;

public class Ejercicio_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;		
		
        do {
            System.out.print("Ingrese una numero: ");
            n = input.nextInt();
        } while (n<=0);

	    double piCalculado=1;
	    int contador =0;
	    for (int i = 3; i < 2*n; i= i + 2) {
	    	double termino = 1.0 / (i);
	        if (contador % 2 == 0) {
	        	piCalculado -= termino;
	        } else {
	        	piCalculado += termino;
	        }
	        contador++;
	    }
	    
	    piCalculado *= 4;
	    System.out.println("Valor estimado de pi: " + piCalculado);
	    System.out.println("Valor de pi con la funcion Math: " + Math.PI);
	    System.out.println("Diferencia con el valor de Math.PI: " + Math.abs(piCalculado - Math.PI));
	}
}
