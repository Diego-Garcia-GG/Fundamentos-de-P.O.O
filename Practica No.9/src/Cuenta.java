import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class Cuenta {
    public int No_Cuenta;
    public String Titular;
    public int Edad;
    public float saldo;

    StringBuilder S = new StringBuilder();

    public void CrearCuenta(){
        No_Cuenta = 12348765;
        saldo = 0;
        Titular = JOptionPane.showInputDialog("Ingrese su nombre completo...");
        Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad..."));
        if(Edad<18){
            JOptionPane.showMessageDialog(null, "ERROR, es menor de edad!");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Cuenta creada con éxito!");
        }
    }

    public void MostrarCuenta(){
        S = S.append("Titular: ").append(Titular).append("\n").append("Edad: ").append(Edad).append("\n").append("No.Cuenta: ").append(No_Cuenta).append("\n").append("Saldo: ").append(saldo);
        JOptionPane.showMessageDialog(null, S);
        S.setLength(0);
    }

    public void ConsultarSaldo(){
        int No_Cuenta2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta..."));
        if(No_Cuenta2 == No_Cuenta){
            JOptionPane.showMessageDialog(null, "Saldo actual: "+saldo+"$");
        } else {
            JOptionPane.showMessageDialog(null, "No.Cuenta NO encontrada!");
        }
    }

    public void IngresarEfectivo(){
        int No_Cuenta3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta..."));
        if(No_Cuenta3 == No_Cuenta){
            float Ingreso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a ingresar..."));
            saldo = Ingreso + saldo;
        } else {
            JOptionPane.showMessageDialog(null, "No.Cuenta NO encontrada!");
        }
    }

    public void RetirarEfectivo(){
        int No_Cuenta4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta..."));
        if(No_Cuenta4 == No_Cuenta){
            float Retiro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a retirar..."));
            if(Retiro>saldo){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
            } else {
                saldo = saldo - Retiro;
                JOptionPane.showMessageDialog(null, "Saldo actual "+saldo+"$");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No.Cuenta NO encontrada!");
        }
    }

    public void DepositarCuenta(){
        JOptionPane.showInputDialog("Ingrese el número de cuenta a depositar...");
        float D = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad del deposito..."));
        if(D>saldo){
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
        } else {
            saldo = saldo - D;
            JOptionPane.showMessageDialog(null, "Deposito realizado!");
        }
    }
}