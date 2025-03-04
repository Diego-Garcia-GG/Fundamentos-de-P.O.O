public class SpartanII extends Spartan{
    public SpartanII(String nombre, int salud, String arma, int Escudo){
        super(nombre,salud,arma,Escudo = 150);
    }

    public void usarManejoAvanzado(){
        System.out.println("El Spartan "+nombre+" con escudo extra y tácticas de combate avanzadas");
    }
}