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
        if(this.conductor != null){
            JOptionPane.showMessageDialog(null, "Ya se ha asignado un conductor a este vehículo.");
        } else {
            this.conductor = CONDUCTOR;
            JOptionPane.showMessageDialog(null, "Conductor asignado correctamente.");
        }
    }

    public Conductor getConductor() {
        return this.conductor;
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
