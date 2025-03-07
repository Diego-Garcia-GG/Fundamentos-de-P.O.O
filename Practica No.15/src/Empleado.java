public class Empleado {
    protected int idEmpleado;
    protected String nombre;
    protected double salario;

    public Empleado(int idEmpleado, String nombre, double salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String mostrarInfo() {
        return "ID: " + idEmpleado + ", Nombre: " + nombre + ", Salario: $" + salario;
    }
}
