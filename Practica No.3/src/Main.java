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




        Scanner sc = new Scanner(System.in);

        JOptionPane.showMessageDialog(null,"2NDO PROGRAMA...");
        System.out.print("Introduzca sus nombres: ");
        String nom = sc.nextLine();
        System.out.println();
        System.out.print("Introduzca apellido paterno: ");
        String AP = sc.nextLine();
        System.out.println();
        System.out.print("Introduzca su apellido materno: ");
        String AM = sc.nextLine();

        String nombre = (nom + " " + AP + " " + AM);

        JOptionPane.showMessageDialog(null,nombre+"\n"+nombre+"\n"+nombre);

        JOptionPane.showMessageDialog(null,nombre.toLowerCase());
        JOptionPane.showMessageDialog(null,nombre.toUpperCase());

        JOptionPane.showMessageDialog(null,nombre.substring(0,1).toUpperCase()+nombre.substring(6,7).toUpperCase()+nombre.substring(14,15).toUpperCase()+nombre.substring(21,22).toUpperCase());
        //Diego Antonio García García
        //01234 5 6789101112 13 141516171819 20 21 //2ndo programa




        JOptionPane.showMessageDialog(null,"3ER PROGRAMA...");
        int ent = 0,suma = 0;
        ent = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca un número entero..."));

        for(int i=0;i<=ent;i++){
            suma = suma + i;
        }

        JOptionPane.showMessageDialog(null,"La suma del número 1, hasta el entero digitado es: "+suma); //3er programa
    }
}