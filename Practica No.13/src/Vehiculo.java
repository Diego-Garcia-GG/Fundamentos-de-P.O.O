import java.util.*;
import javax.swing.JOptionPane;

public class Vehiculo {
    private String placa = "";
    private String modelo = "";
    private int capacidadcarga = 0;

    private Conductor conductor;

    public Vehiculo(String PLACA, String MODELO, int CAPACIDADCARGA){
        this.placa = PLACA;
        this.modelo = MODELO;
        this.capacidadcarga = CAPACIDADCARGA;
    }

    public void asignarConductor(Conductor CONDUCTOR){

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadcarga() {
        return capacidadcarga;
    }

    public void setCapacidadcarga(int capacidadcarga) {
        this.capacidadcarga = capacidadcarga;
    }
}
