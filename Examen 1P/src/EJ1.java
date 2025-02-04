import java.util.*;
import javax.swing.JOptionPane;

public class EJ1 {
    public static void main(String[] args) {
        StringBuilder aux = new StringBuilder();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entero positivo..."));
        int numAP = 0;
        if(num==0){
            JOptionPane.showMessageDialog(null, "El resultado final es: "+num);
        }else if(num<0){
            JOptionPane.showMessageDialog(null, "ERROR, número negativo, vuelva a intentar...");
        }else{
            aux.append(num).append(" , ");
            if(num%2==0){
                numAP = num / 2;
                aux.append(numAP).append(" , ");
                do{
                    if(numAP%2==0){
                        numAP = numAP / 2;
                        aux.append(numAP).append(" , ");
                    }else{
                        numAP = (numAP*3)+1;
                        aux.append(numAP).append(" , ");
                    }
                }while(numAP!=1);
                System.out.print(aux);
            }

            if(num%2!=0){
                numAP = (num*3)+1;
                aux.append(numAP).append(" , ");
                do{
                    if(numAP%2!=0){
                        numAP = (numAP*3)+1;
                        aux.append(numAP).append(" , ");
                    }else{
                        numAP = numAP / 2;
                        aux.append(numAP).append(" , ");
                    }
                }while(numAP!=1);
                System.out.print(aux);
            }
        }
    }
}