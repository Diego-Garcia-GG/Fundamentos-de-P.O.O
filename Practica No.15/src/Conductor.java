import javax.swing.*;

public class Conductor extends Empleado {
    protected String tipolicencia;

    public Conductor(int idEmpleado, String nombre, double salario, String tipolicencia) {
        super(idEmpleado, nombre, salario);
        this.tipolicencia = tipolicencia;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Tipo de licencia: " + tipolicencia;
    }

    public String getTipolicencia() {
        return tipolicencia;
    }

    public void setTipolicencia(String tipolicencia) {
        this.tipolicencia = tipolicencia;
    }
}

