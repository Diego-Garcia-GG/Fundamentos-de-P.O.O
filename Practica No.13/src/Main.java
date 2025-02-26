import java.util.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int op = 0;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("-- Bienvenido, seleccione una opción --"+"\n\n"+"1.- Registrar Vehículo"+"\n\n"+"2.- Registrar Conductor"+"\n\n"+"3.- Asignar Conductor - Vehículo"+"\n\n"+"4.- Registrar Envío"+"\n\n"+"5.- Registrar Entrega"+"\n\n"+"6.- Actualizar Estado de Entrega"+"\n\n"+"7.- Ver Información"+"\n\n"+"8.- Salir"));
            switch(op){
                case 1:
                    String PLACA = "";
                    String MODELO = "";
                    int CAPACIDADCARGA = 0;

                    PLACA = JOptionPane.showInputDialog("Ingrese la placa del vehículo...");
                    if(PLACA.isEmpty()){
                        JOptionPane.showMessageDialog(null, "ERROR, Información vacía!");
                        break;
                    } else {
                        MODELO = JOptionPane.showInputDialog("Ingrese el modelo del vehículo...");
                        if(MODELO.isEmpty()){
                            JOptionPane.showMessageDialog(null, "ERROR, Información vacía!");
                            break;
                        } else {
                            CAPACIDADCARGA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo (KG)..."));
                            JOptionPane.showMessageDialog(null,"Vehículo Registrado!");
                        }
                    }

                    Vehiculo V1 = new Vehiculo(PLACA,MODELO,CAPACIDADCARGA);
                break;
                case 2:
                    String NOMBRE = "";
                    String IDENTIFICACION = "";
                    String LICENCIA = "";

                    NOMBRE = JOptionPane.showInputDialog("Ingrese el nombre del conductor...");
                    if(NOMBRE.isEmpty()){
                        JOptionPane.showMessageDialog(null,"ERROR, Información vacía!");
                        break;
                    } else {
                        IDENTIFICACION = JOptionPane.showInputDialog("Ingrese el No. de Identificacion...");
                        if(IDENTIFICACION.isEmpty()){
                            JOptionPane.showMessageDialog(null,"ERROR, Información vacía!");
                            break;
                        } else {
                            LICENCIA = JOptionPane.showInputDialog("Ingrese el No. de Licencia");
                            if(LICENCIA.isEmpty()){
                                JOptionPane.showMessageDialog(null,"ERROR, Información vacía!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Conductor Registrado!");
                            }
                        }
                    }

                    Conductor C1 = new Conductor(NOMBRE,IDENTIFICACION,LICENCIA);
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                break;
                case 6:
                break;
                case 7:
                break;
            }
        }while(op!=8);
    }
}