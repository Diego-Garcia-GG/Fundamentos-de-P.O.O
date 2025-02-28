import javax.swing.JOptionPane;

public class Entrega {
    private String numeroGuia = "";
    private String estado = "";

    public Entrega(String numeroGuia){
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    public void actualizarEstado(String nuevoEstado){
        if(nuevoEstado.equalsIgnoreCase("En tránsito") || nuevoEstado.equalsIgnoreCase("Entregado")){
            this.estado = nuevoEstado;
            JOptionPane.showMessageDialog(null, "Estado actualizado a: " + nuevoEstado);
        } else {
            JOptionPane.showMessageDialog(null, "Estado inválido. Solo se permite 'En tránsito' o 'Entregado'.");
        }
    }

    public String getNumeroGuia(){
        return numeroGuia;
    }

    public String getEstado(){
        return estado;
    }
}
