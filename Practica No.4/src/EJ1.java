import java.util.*;
import javax.swing.JOptionPane;

public class EJ1 {
    public static void main(String[] args) {
        String Contrasena = "Qwerty123";
        String ContrasenaC = JOptionPane.showInputDialog("Introduzca una contraseña...");

        if(ContrasenaC.equalsIgnoreCase(Contrasena)){
            JOptionPane.showMessageDialog(null, "La contraseña introducida coincide!");
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña introducida NO coincide!");
        }
    }
}