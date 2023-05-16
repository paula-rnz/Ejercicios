package ejercicios_POO;

public class Trabajador {
	
	private String nombres;
	private String apellidos;
	private String run;
	private int telefono;
	private int edad;
	
    public Trabajador() {}
    
    public Trabajador(String nombres, String apellidos, String run, int telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }
    
    public String nombreCompleto(String nombre, String apellido) {
    	String nomCompleto = nombre + " " + apellido;
    	return(nomCompleto);    	
    }
    
    public int descomponerRun(String run) {
        String[] partes = run.split("-");
        String numeroSinDV = partes[0];
        return Integer.parseInt(numeroSinDV);
    }
    
    public String toString() {
        return "Trabajador [nombres=" + nombres + ", apellidos=" + apellidos + ", run=" + run + ", telefono=" + telefono
                + ", edad=" + edad + "]";
    }

	
}
