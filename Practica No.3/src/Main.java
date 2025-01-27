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

        JOptionPane.showMessageDialog(null,nombre.substring(0,1).toUpperCase()+AP.substring(0,1).toUpperCase()+AM.substring(0,1).toUpperCase());
        //Diego Antonio García García
        //01234 5 6789101112 13 141516171819 20 21 //2ndo programa




        JOptionPane.showMessageDialog(null,"3ER PROGRAMA...");
        int ent = 0,suma = 0;
        ent = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca un número entero..."));

        for(int i=0;i<=ent;i++){
            suma = suma + i;
        }

        JOptionPane.showMessageDialog(null,"La suma del número 1, hasta el entero digitado es: "+suma); //3er programa




        JOptionPane.showMessageDialog(null,"4TO PROGRAMA...");
        String nom1 = JOptionPane.showInputDialog("Introduzca sus nombres...");
        String AP1 = JOptionPane.showInputDialog("Introduzca su apellido paterno...");
        String AM1 = JOptionPane.showInputDialog("Introduzca su apellido materno...");

        String nombre1 = (nom1 + " " + AP1 + " " + AM1);

        JOptionPane.showMessageDialog(null, nombre1.toUpperCase()+" tiene: "+nombre1.length()+" letras"); //4to programa




        JOptionPane.showMessageDialog(null,"5TO PROGRAMA...");

        int Munecas = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de muñecas del último paquete..."));
        int Payasos = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de payasos del último paquete..."));

        float total = (Munecas * 75) + (Payasos * 112);
        total = total/1000;

        JOptionPane.showMessageDialog(null, "El total de gramaje/Peso es: "+total+" Kg"); //5to programa





        JOptionPane.showMessageDialog(null, "6TO PROGRAMA...");
        String Frase = JOptionPane.showInputDialog("Introduzca cualquier frase...");
        String FraseI = "";
        for(int i=Frase.length()-1;i>=0;i--){
            FraseI = FraseI + Frase.charAt(i);
        }

        JOptionPane.showMessageDialog(null,"La cadena invertida de "+Frase+ " es: "+FraseI); //6to programa
    }
}