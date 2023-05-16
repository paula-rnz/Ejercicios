package ejercicios_POO;

import java.util.Scanner;


public class Ejercicio_26 {
	
	 public static void main(String[] args) {
		 
		 
		 Scanner sc = new Scanner(System.in);
		 int cantidadTrabajadores;
		 String nombres;
		 String apellidos;
		 String run;
		 int telefono;
		 int edad;
	     

		 do {
			 System.out.println("Ingrese cantidad de asistentes minimo 3:");
			 cantidadTrabajadores = sc.nextInt();
		 }while (cantidadTrabajadores < 3 );
       
		 for(int i = 0 ; i < cantidadTrabajadores ; i++) {
    	   
			 System.out.println("\nIngrese Nombres del Trabajador:");
			 do {
	   			 nombres = sc.nextLine();
	   		 }while (nombres.isEmpty());
	           
	   		 do {
	   			 System.out.println("Ingrese Apellidos del Trabajador:");
	   			 apellidos = sc.nextLine();
	   		 }while (apellidos.isEmpty());	
	   		 
	   		 do {
	   			 System.out.println("Ingrese RUN sin puntos con - :");
	   			 run = sc.nextLine();
	   		 }while (run.isEmpty());
	   	 
	   		 do {
	   			 System.out.println("Ingrese telefono del Trabajador:");
	   			 telefono = sc.nextInt();
	   		 }while (telefono<0);	
	   		 
	   		 do {
	   			 System.out.println("Ingrese edad del Trabajador:");
	   			 edad = sc.nextInt();
	   		 }while (edad<0);		
	   		 
	   		Trabajador trabajador = new Trabajador(nombres, apellidos, run, telefono, edad);
	   		 
	   		 String nombreCompleto = trabajador.nombreCompleto(trabajador.nombres, trabajador.apellidos);
	   		 System.out.println("Nombre Completo: "+ nombreCompleto);
	   		 
	   		 int rut = trabajador.descomponerRun(trabajador.run);
	   		 System.out.println("Rut: "+rut);
        
	   		 System.out.println("Telefono: "+ trabajador.telefono);
	   		 System.out.print("Edad: " + trabajador.edad + "\n");
        }
     
		 
	 }
	 
}
