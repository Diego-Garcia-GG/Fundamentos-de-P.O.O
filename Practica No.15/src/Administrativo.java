import javax.swing.*;

public class Administrativo extends Empleado {
    protected String departamento;

    public Administrativo(int idEmpleado, String nombre, double salario, String departamento) {
        super(idEmpleado, nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Departamento: " + departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
