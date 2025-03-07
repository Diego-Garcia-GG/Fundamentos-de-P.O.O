import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer?\n\n1.- Agregar empleados\n2.- Listar empleados\n3.- Salir"));
            switch (op) {
                case 1:
                    int op2 = Integer.parseInt(JOptionPane.showInputDialog("¿Qué tipo de empleado desea agregar?\n\n1.- Conductor\n2.- Administrativo"));
                    if (op2 == 1) {
                        int idEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del conductor:"));
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del conductor:"));
                        String tipoLicencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia del conductor:");

                        empleados.add(new Conductor(idEmpleado, nombre, salario, tipoLicencia));
                    } else if (op2 == 2) {
                        int idEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del administrativo:"));
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del administrativo:");
                        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del administrativo:"));
                        String departamento = JOptionPane.showInputDialog("Ingrese el departamento del administrativo:");

                        empleados.add(new Administrativo(idEmpleado, nombre, salario, departamento));
                    }
                    break;
                case 2:
                    if (empleados.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
                    } else {
                        StringBuilder listado = new StringBuilder("Lista de Empleados:\n\n");
                        for (int i = 0; i <= empleados.size() - 1; i++) {
                            listado.append(empleados.get(i).mostrarInfo()).append("\n----------------------\n");
                        }
                        JOptionPane.showMessageDialog(null, listado.toString(), "Listado de Empleados", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.");
            }
        } while (op != 3);
    }
}
