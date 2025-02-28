import java.util.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int op = 0;

        Vehiculo V1 = null;
        Conductor C1 = null;
        Envios E1 = null;
        Entrega Ent1 = null;

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

                    V1 = new Vehiculo(PLACA,MODELO,CAPACIDADCARGA);
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

                    C1 = new Conductor(NOMBRE,IDENTIFICACION,LICENCIA);
                break;
                case 3:
                    if(V1 == null){
                        JOptionPane.showMessageDialog(null, "Primero registre un vehículo.");
                    } else if(C1 == null){
                        JOptionPane.showMessageDialog(null, "Primero registre un conductor.");
                    } else {
                        V1.asignarConductor(C1);
                    }
                break;
                case 4:
                    E1 = Envios.crearEnvio();
                break;
                case 5:
                    String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía de la entrega:");
                    if(numeroGuia.isEmpty()){
                        JOptionPane.showMessageDialog(null, "ERROR, Información vacía!");
                        break;
                    }
                    Ent1 = new Entrega(numeroGuia);
                    JOptionPane.showMessageDialog(null, "Entrega registrada con estado 'Pendiente'.");
                break;
                case 6:
                    if(Ent1 == null){
                        JOptionPane.showMessageDialog(null, "No hay entrega registrada.");
                        break;
                    }
                    String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado de la entrega (En tránsito o Entregado):");
                    Ent1.actualizarEstado(nuevoEstado);
                break;
                case 7:
                    String info = "";
                    if(V1 != null){
                        info += "Vehículo:\n" +
                                "Placa: " + V1.getPlaca() + "\n" +
                                "Modelo: " + V1.getModelo() + "\n" +
                                "Capacidad de Carga: " + V1.getCapacidadcarga() + "\n";
                        if(V1.getConductor() != null){
                            Conductor temp = V1.getConductor();
                            info += "Conductor asignado:\n" +
                                    "Nombre: " + temp.getNombre() + "\n" +
                                    "Identificación: " + temp.getIdentificacion() + "\n" +
                                    "Licencia: " + temp.getLicencia() + "\n";
                        } else {
                            info += "Conductor asignado: No\n";
                        }
                    } else {
                        info += "Vehículo no registrado.\n";
                    }

                    if(C1 != null){
                        info += "\nConductor Registrado:\n" +
                                "Nombre: " + C1.getNombre() + "\n" +
                                "Identificación: " + C1.getIdentificacion() + "\n" +
                                "Licencia: " + C1.getLicencia() + "\n";
                    } else {
                        info += "\nConductor no registrado.\n";
                    }

                    if(E1 != null){
                        info += "\nEnvío:\n" +
                                "Código de Envío: " + E1.getCodigoEnvio() + "\n" +
                                "Destino: " + E1.getDestino() + "\n" +
                                "Peso: " + E1.getPeso() + "\n";
                    } else {
                        info += "\nEnvío no registrado.\n";
                    }

                    if(Ent1 != null){
                        info += "\nEntrega:\n" +
                                "Número de Guía: " + Ent1.getNumeroGuia() + "\n" +
                                "Estado: " + Ent1.getEstado() + "\n";
                    } else {
                        info += "\nEntrega no registrada.\n";
                    }

                    JOptionPane.showMessageDialog(null, info);
                break;
            }
        }while(op!=8);
    }
}