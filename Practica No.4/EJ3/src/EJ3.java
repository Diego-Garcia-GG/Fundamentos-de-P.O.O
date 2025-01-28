import java.util.*;
import javax.swing.JOptionPane;

public class EJ3 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es su edad?"));
        if(edad<0){
            JOptionPane.showMessageDialog(null, "ERROR, vuelva a intentarlo...");
        } else if (edad>=0 && edad<=3) {
            JOptionPane.showMessageDialog(null, "Usted entra GRATIS!");
        } else if (edad>=4 && edad<=18) {
            JOptionPane.showMessageDialog(null, "Usted debe pagar $110");
        } else if (edad>=19) {
            JOptionPane.showMessageDialog(null, "Usted debe pagar $190");
        }
    }
}