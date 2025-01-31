import java.util.*;
import javax.swing.JOptionPane;

public class EJ4 {
    public static void main(String[] args) {
        StringBuilder JOl = new StringBuilder();
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero..."));

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    JOl.append(j).append(" ");
                }
                JOl.append("\n");
            }
        } else {
            for (int i = -1; i >= num; i--) {
                for (int j = -1; j >= i; j--) {
                    JOl.append(j).append(" ");
                }
                JOl.append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, JOl.toString());
    }
}
