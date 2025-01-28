import java.util.*;
import javax.swing.JOptionPane;

public class EJ5 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("1er número..."));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("2ndo número..."));
        int num3 = 0;
        String operador = JOptionPane.showInputDialog("¿Qué operación desea hacer? ( + , - , * , / )");

        switch(operador){
            case "+":
                num3 = num1 + num2;
                JOptionPane.showMessageDialog(null, num3);
            break;
            case "-":
                num3 = num1 - num2;
                JOptionPane.showMessageDialog(null, num3);
            break;
            case "*":
                num3 = num1 * num2;
                JOptionPane.showMessageDialog(null, num3);
            break;
            case "/":
                if(num2==0){
                    JOptionPane.showMessageDialog(null,"La división es indeterminada!");
                } else {
                    JOptionPane.showMessageDialog(null, num3);
            }
        }

    }
}