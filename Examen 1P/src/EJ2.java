import java.util.*;
import javax.swing.JOptionPane;

public class EJ2 {
    public static void main(String[] args) {
        StringBuilder Aux = new StringBuilder();
        String Palabra = JOptionPane.showInputDialog("Introduzca una palabra...");
        for(int i=0;i<=Palabra.length()-1;i++){
            Aux.append("Letra "+(i+1)+": "+Palabra.charAt(i)+" ");
        }

        JOptionPane.showMessageDialog(null,Aux);
    }
}