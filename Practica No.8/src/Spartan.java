import java.sql.SQLOutput;

public class Spartan {

    //Atributos
    private String nombre;
    private int salud;
    private int escudo;
    private String ArmaPrincipal;

    public Spartan(String nombre, int salud, int escudo, String armaPrincipal) {
        this.nombre = nombre;
        this.salud = salud;
        this.escudo = escudo;
        this.ArmaPrincipal = armaPrincipal;
    }

    //Métodos
    public void MostrarInfo(){
        System.out.println("---- Información del Spartan ----");
        System.out.println("Nombre: "+nombre);
        System.out.println("Salud: "+salud);
        System.out.println("Escudo: "+escudo);
        System.out.println("Arma principal: "+ArmaPrincipal);
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("------ Acciones del Spartan -----");
    }

    public void Atacar(String enemigo){
        System.out.println(nombre+" ataca a "+enemigo+" con "+ArmaPrincipal);
    }

    public void RecargarArma(int municiones){
        int restante = 10;
        int total = restante + municiones;
        System.out.println("El arma "+ArmaPrincipal+" tiene "+total+" balas totales");
    }

    public void Correr(boolean status){
        if(status==true){
            System.out.println("El spartan "+nombre+" esta corriendo");
            System.out.println("---------------------------------");
        } else {
            System.out.println("El spartan "+nombre+" se detuvo");
            System.out.println("---------------------------------");
        }
    }

    private void ConsultarCortana(){
        System.out.println("Converacion Privada...");
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getArmaPrincipal() {
        return ArmaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        ArmaPrincipal = armaPrincipal;
    }
}
