import java.sql.ResultSet;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        int no_Cuenta = 12348765;
        float saldo = 0;
        String titular = JOptionPane.showInputDialog("Ingrese su nombre completo...");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad..."));

        Cuenta C1 = new Cuenta(no_Cuenta,titular,edad,saldo);

        int op = 0;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué desea hacer "+C1.getTitular()+"?"+"\n\n"+"1.- Consultar Cuenta"+"\n\n"+"2.- Consultar Saldo"+"\n\n"+"3.- Ingresar Efectivo"+"\n\n"+"4.- Retirar Efectivo"+"\n\n"+"5.- Depositar"+"\n\n"+"6.- Salir"));
            switch (op) {
                case 1:
                    C1.MostrarCuenta();
                break;
                case 2:
                    C1.ConsultarSaldo();
                break;
                case 3:
                    C1.IngresarEfectivo();
                break;
                case 4:
                    C1.RetirarEfectivo();
                break;
                case 5:
                    C1.DepositarCuenta();
                break;
            }
        }while(op!=6);
    }
}
