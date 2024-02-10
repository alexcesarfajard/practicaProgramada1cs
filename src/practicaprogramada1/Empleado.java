package practicaprogramada1;

public class Empleado {

    private String nombreCompleto;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;
    private double incremento;

    public Empleado() {
        this.nombreCompleto = "";
        this.cedula = "";
        this.edad = 0;
        this.casado = false;
        this.salario = 0.02f;
        this.incremento = 0.02f;
    }

    public Empleado(String nombreCompleto, String cedula, int edad, boolean casado, double salario, double incremento) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
        this.incremento = incremento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    private String esCasado(boolean casado) {
        String esCasado = "";

        if (casado == true) {
            esCasado = "Casado";
        } else if (casado == false) {
            esCasado = "Soltero";
        }

        return esCasado;
    }

    private String clasificacionEdad(int edad) {
        String clasificacion = "";

        if (edad <= 21) {
            clasificacion = "Principiante";
        } else if (edad >= 22 && edad <= 35) {
            clasificacion = "Intermedio";
        } else if (edad > 35) {
            clasificacion = "Senior";
        }

        return clasificacion;
    }

    private double aumentarSalario(double porcentaje, double salario) {
        double nuevoSalario = 0.0;

        if (porcentaje != 0) {
            nuevoSalario = salario + (porcentaje / 100 * salario);
        } else if (porcentaje == 0) {
            nuevoSalario = salario;
        }

        return nuevoSalario;
    }

    @Override
    public String toString() {
        return "Empleado: \nNombre: " + this.getNombreCompleto() + "\nCédula: " + this.getCedula()
                + "\nEdad: " + this.getEdad() + "\nClasificación: " + clasificacionEdad(this.getEdad())
                + "\nEstado civil: " + esCasado(this.isCasado()) + "\nSalario: " + this.getSalario()
                + "\nIncremento del salario: " + this.getIncremento() + "%" 
                + "\nNuevo salario: " + aumentarSalario(this.getIncremento(), this.getSalario());
    }

}
