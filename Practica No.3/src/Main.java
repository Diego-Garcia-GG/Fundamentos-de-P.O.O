import java.util.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"1ER PROGRAMA...");

        int horas = 0;
        float C_horas = 0;

        horas = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca las horas trabajadas..."));
        C_horas = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca el coste x hora..."));

        double C_Total = (horas * C_horas);

        JOptionPane.showMessageDialog(null,"Usted está cobrando: $"+C_Total); //1er Programa




    }
}