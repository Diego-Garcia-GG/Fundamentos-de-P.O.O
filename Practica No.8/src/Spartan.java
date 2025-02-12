public class Spartan {

    //Atributos
    public String nombre;
    public int salud;
    public int escudo;
    public String ArmaPrincipal;

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
}
