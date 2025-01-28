import java.util.*;
import javax.swing.JOptionPane;

public class EJ2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entero..."));
        if(num%2==0){
            JOptionPane.showMessageDialog(null,"El número es par!");
        } else {
            JOptionPane.showMessageDialog(null, "El número es impar!");
        }
    }
}