import java.util.*;
import javax.swing.JOptionPane;

public class EJ7 {
    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de * en la base del árbol (número impar):"));

        if (base % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número impar.");
            return;
        }

        int fila = 1;
        StringBuilder arbol = new StringBuilder();

        while (fila <= base) {
            int espacios = (base - fila) / 2;
            int i = 0;
            while (i < espacios) {
                arbol.append(" ");
                i++;
            }

            int j = 0;
            while (j < fila) {
                arbol.append("*");
                j++;
            }

            arbol.append("\n");
            fila += 2;
        }

        int tronco_espacios = (base - 1) / 2;
        int k = 0;
        while (k < tronco_espacios) {
            arbol.append(" ");
            k++;
        }
        arbol.append("*\n");

        JOptionPane.showMessageDialog(null, arbol.toString());
    }
}
