public class SpartanIV extends Spartan{
    public SpartanIV(String nombre, int salud, String arma, int Escudo){
        super(nombre,salud,arma,Escudo = 100);
    }

    public void usaPropulsores(){
        System.out.println("El Spartan "+nombre+" usa propulsores para moverse rapidamente");
    }
}
