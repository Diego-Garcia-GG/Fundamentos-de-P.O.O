import java.util.*;
import javax.swing.JOptionPane;

public class EJ1 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un número entero (Positivo)..."));
        int numI = 0;
        String numIJ = "";
        if(num<0){
            JOptionPane.showMessageDialog(null, "ERROR, vuelva a intentarlo...");
        } else {
            for(int i=1;i<=num;i++){
                if(i%2!=0){
                    numIJ = numIJ + i + " , ";
                }
            }
        }
        JOptionPane.showMessageDialog(null,numIJ);
    }
}