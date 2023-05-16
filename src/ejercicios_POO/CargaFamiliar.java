package ejercicios_POO;

public class CargaFamiliar {
	
	private String run;
    private String nombres;
    private String apellidos;
    private String runFamiliar;
    private int parentesco;
    private int edad;

    public CargaFamiliar(String run, String nombres, String apellidos, String runFamiliar, int parentesco, int edad) {
        this.run = run;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.runFamiliar = runFamiliar;
        this.parentesco = parentesco;
        this.edad = edad;
    }
    
    public String parentescoToString() {
        switch (parentesco) {
            case 1:
                return "Cónyuge";
            case 2:
                return "Hijo/a";
            case 3:
                return "Otro";
            default:
                return "Desconocido";
        }
    }

    @Override
    public String toString() {
        return "CargaFamiliar{" +
                "run='" + run + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", runFamiliar='" + runFamiliar + '\'' +
                ", parentesco=" + parentescoToString() +
                ", edad=" + edad +
                '}';
    }
}
