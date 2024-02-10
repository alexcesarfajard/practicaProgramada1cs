package practicaprogramada1;

public class Programador extends Empleado{
    
    private int lineasPorHora;
    private String lenguajeDominante; 

    public Programador() {
        this.lineasPorHora = 0;
        this.lenguajeDominante = "";
    }

    public Programador(String nombreCompleto, String cedula, int edad, boolean casado, double salario, 
            double incremento, int lineasPorHora, String lenguajeDominante) {
        
        super(nombreCompleto, cedula, edad, casado, salario, incremento);
        this.lineasPorHora = lineasPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasPorHora() {
        return lineasPorHora;
    }

    public void setLineasPorHora(int lineasPorHora) {
        this.lineasPorHora = lineasPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
    
    public String toString(){
        return "Programador: " + super.toString() + "\nLineas de código por hora: " + this.getLineasPorHora()
                + "\nLenguaje de programación dominante: " + this.getLenguajeDominante();
    }
    
    
    
    
    
}
