import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        String AnioC = JOptionPane.showInputDialog("Ingrese el año en curso...");
        String Nombre = JOptionPane.showInputDialog("Ingrese su nombre...");
        String App = JOptionPane.showInputDialog("Ingrese su apellido paterno...");
        String Apm = JOptionPane.showInputDialog("Ingrese su apellido materno...");
        String Anio = JOptionPane.showInputDialog("Ingre su año de nacimiento...");
        String Carrera = JOptionPane.showInputDialog("Ingrese su carrera...");

        Constructor C1 = new Constructor(AnioC,Nombre,App,Apm,Anio,Carrera);
        C1.generarMatricula();
        C1.mostrarMatricula();
    }
}