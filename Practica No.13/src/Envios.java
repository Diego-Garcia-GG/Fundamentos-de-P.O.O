import javax.swing.*;

public class Envios {
    private String codigoenvio = "";
    private String destino = "";
    private float peso = 0;

    public Envios(String CODIGOENVIO, String DESTINO){ //1er Constructor para código y destino
        this.codigoenvio = CODIGOENVIO;
        this.destino = DESTINO;
    }

    public Envios(String CODIGOENVIO, String DESTINO, float PESO){ //2ndo Constructor para código, destino y peso
        this.codigoenvio = CODIGOENVIO;
        this.destino = DESTINO;
        this.peso = PESO;
    }

    public static Envios crearEnvio(){
        String codigoEnvio = "";
        String Destino = "";
        float Peso = 0;
        int op2 = 0;

        op2 = Integer.parseInt(JOptionPane.showInputDialog("-- ¿Cómo desea registrar el envío? --"+"\n\n"+"1.- Solo con código y destino"+"\n\n"+"2.- Con código, destino y peso"));
        if(op2 == 1){
            codigoEnvio = JOptionPane.showInputDialog("Ingrese el código del envío...");
            Destino = JOptionPane.showInputDialog("Ingrese el destino del envío...");
            JOptionPane.showMessageDialog(null, "Envío Registrado!");
            return new Envios(codigoEnvio,Destino);
        } else if (op2 == 2) {
            codigoEnvio = JOptionPane.showInputDialog("Ingrese el código del envío...");
            Destino = JOptionPane.showInputDialog("Ingrese el destino del envío...");
            Peso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso del envío..."));
            JOptionPane.showMessageDialog(null, "Envío Registrado!");
            return new Envios(codigoEnvio,Destino,Peso);
        }
        JOptionPane.showMessageDialog(null, "ERROR!");
        return crearEnvio();
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCodigoEnvio() {
        return codigoenvio;
    }

    public String getDestino() {
        return destino;
    }
}
