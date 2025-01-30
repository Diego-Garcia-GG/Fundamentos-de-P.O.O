import java.util.*;
import javax.swing.JOptionPane;

public class EJ5 {
    public static void main(String[] args) {
        String Frase = JOptionPane.showInputDialog("Ingrese una frase...");
        String Letra = JOptionPane.showInputDialog("Ingrese una letra...");
        char LetraI = Letra.charAt(0);
        int C = 0;

        if(Letra.length() >= 2){
            JOptionPane.showMessageDialog(null, "ERROR, solo puedes digitar una letra");
        } else {
            for(int i = 0; i <= Frase.length() - 1; i++){
                if(Character.toLowerCase(Frase.charAt(i)) == Character.toLowerCase(LetraI)){
                    C = C + 1;
                }
            }
            JOptionPane.showMessageDialog(null, "La palabra '"+Frase+"' Tiene la letra '"+LetraI+"' la cantidad de: "+C+ " veces");
        }
    }
}
