import java.util.*;
import javax.swing.JOptionPane;

public class EJ3 {
    public static void main(String[] args) {
        StringBuilder JOl = new StringBuilder();
        String op = "";
        int C=0,num=0;

        for(int i=1;i<=10;i++){
            JOl.append("Tabla del ").append(i).append(": \n\n");
            for(int j=1;j<=10;j++){
                JOl.append(i).append(" x ").append(j).append(" = ").append((i*j)).append("\n");
            }
            JOptionPane.showMessageDialog(null, JOl);
            JOl.setLength(0);
        }
    }
}
