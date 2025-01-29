import java.util.*;
import javax.swing.JOptionPane;

public class EJ2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un número entero (Positivo)..."));
        int numI = 0;
        String numIJ = "";
        if(num<0){
            JOptionPane.showMessageDialog(null, "ERROR, vuelva a intentarlo...");
        } else {
            for(int i=0;i<=num;i++){
                numI = i;
                numIJ = numI + "," + numIJ;
            }
        }
        JOptionPane.showMessageDialog(null,numIJ);
    }
}
