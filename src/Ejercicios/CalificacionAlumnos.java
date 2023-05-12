package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class CalificacionAlumnos {
	
	public static void main (String[] args) {
		
	
		Scanner input = new Scanner(System.in);

		String nombre;
		ArrayList<String> alumnos = new ArrayList<>();
		ArrayList<Double> notas = new ArrayList<>();
		do {
			
		    System.out.println("Ingrese nombre del alumno: ");
		    nombre = input.nextLine().toLowerCase();
		    if (nombre.equals("salir")) {
		        break;
		    }
		    
		    System.out.println("Ingrese calificacion del alumno: ");
		    double nota = input.nextDouble();
		    
		    alumnos.add(nombre);
		    notas.add(nota);
		
		
		} while (!nombre.equals("salir"));
		
		double promedio = 0;
		for (double nota : notas) {
		    promedio += nota;
		}
		promedio /= notas.size();
		System.out.println("El promedio del curso es: " + promedio);
		
		for (double nota : notas) {
			System.out.println("nota antes de "+nota);
		}
		
		
		for (int i = 1; i < notas.size(); i++) {
		
		
		    if (notas.get(i) < notas.get(i-1)) {
		    	double aux = notas.get(i);
		    	notas.set(i,notas.get(i-1));
		    	notas.set(i-1,aux);
		    	String aux1 = alumnos.get(i);
		    	alumnos.set(i,alumnos.get(i-1));
		    	alumnos.set(i-1,aux1);
		    }
		
		}
		for (double nota : notas) {
			System.out.println("nota "+nota);
		}
			
	}

}
