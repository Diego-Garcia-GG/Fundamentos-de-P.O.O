import java.util.*;
import javax.swing.JOptionPane;

public class EJ4 {
    public static void main(String[] args) {
        String Palindromo = JOptionPane.showInputDialog("Introduzca una palabra...");
        String PalindromoA = "";
        for(int i=Palindromo.length()-1;i>=0;i--){
            PalindromoA = PalindromoA + Palindromo.charAt(i);
        }

        if(Palindromo.equalsIgnoreCase(PalindromoA)){
            JOptionPane.showMessageDialog(null, "La palabra es palindromo!");
        } else {
            JOptionPane.showMessageDialog(null, "La palabra NO es palindoromo");
        }
    }
}