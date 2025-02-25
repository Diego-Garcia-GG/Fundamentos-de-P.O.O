import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class Cuenta {

    private int No_Cuenta;
    private String Titular;
    private int Edad;
    private float saldo;

    public Cuenta(int no_Cuenta, String titular, int edad, float saldo){
        this.No_Cuenta = no_Cuenta;
        this.saldo = saldo;
        this.Titular = titular;
        this.Edad = edad;
    }

    StringBuilder S = new StringBuilder();

    public void MostrarCuenta(){
        S = S.append("Titular: ").append(getTitular()).append("\n").append("Edad: ").append(getEdad()).append("\n").append("No.Cuenta: ").append(getNo_Cuenta()).append("\n").append("Saldo: ").append(getSaldo());
        JOptionPane.showMessageDialog(null, S);
        S.setLength(0);
    }

    public void ConsultarSaldo(){
        int No_Cuenta2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta..."));
        if(No_Cuenta2 == getNo_Cuenta()){
            JOptionPane.showMessageDialog(null, "Saldo actual: "+getSaldo()+"$");
        } else {
            JOptionPane.showMessageDialog(null, "No.Cuenta NO encontrada!");
        }
    }

    public void IngresarEfectivo(){
        int No_Cuenta3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta..."));
        if(No_Cuenta3 == getNo_Cuenta()){
            float Ingreso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a ingresar..."));
            saldo = Ingreso + getSaldo(); ////////
        } else {
            JOptionPane.showMessageDialog(null, "No.Cuenta NO encontrada!");
        }
    }

    public void RetirarEfectivo(){
        int No_Cuenta4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta..."));
        if(No_Cuenta4 == getNo_Cuenta()){
            float Retiro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad a retirar..."));
            if(Retiro>getSaldo()){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
            } else {
                saldo = saldo - Retiro;
                JOptionPane.showMessageDialog(null, "Saldo actual "+getSaldo()+"$");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No.Cuenta NO encontrada!");
        }
    }

    public void DepositarCuenta(){
        JOptionPane.showInputDialog("Ingrese el número de cuenta a depositar...");
        float D = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad del deposito..."));
        if(D>getSaldo()){
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
        } else {
            saldo = saldo - D;
            JOptionPane.showMessageDialog(null, "Deposito realizado!");
        }
    }

    public int getNo_Cuenta() {
        return No_Cuenta;
    }

    public void setNo_Cuenta(int no_Cuenta) {
        No_Cuenta = no_Cuenta;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}