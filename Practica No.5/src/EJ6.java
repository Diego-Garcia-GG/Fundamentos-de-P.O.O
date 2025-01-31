import java.util.*;
import javax.swing.JOptionPane;

public class EJ6 {
    public static void main(String[] args) {
        int saldo = 0;
        String operacion = "";

        while (true) {
            operacion = JOptionPane.showInputDialog(null, "Ingrese operación (D cantidad / R cantidad) o una línea vacía para finalizar:");

            if (operacion == null || operacion.trim().isEmpty()) {
                break;
            }

            String aux[] = operacion.split(" ");
            char tipo = aux[0].charAt(0);
            int cantidad = Integer.parseInt(aux[1]);

            if (tipo == 'D') {
                saldo = saldo + cantidad; // Depositar
            } else if (tipo == 'R') {
                if (cantidad > saldo) {
                    JOptionPane.showMessageDialog(null, "Fondos insuficientes.");
                } else {
                    saldo = saldo - cantidad; // Retirar
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operación inválida.");
            }
        }

        JOptionPane.showMessageDialog(null, "Saldo final: $" + saldo);
    }
}
