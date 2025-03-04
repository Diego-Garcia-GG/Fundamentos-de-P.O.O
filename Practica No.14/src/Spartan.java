import javax.swing.JOptionPane;

public class Spartan extends Soldado{
    protected int Escudo = 0;

    public Spartan(String nombre, int salud, String arma, int Escudo){
        super(nombre,salud,arma);
        this.Escudo = Escudo;
    }

    public void recargarEscudo(){
        Escudo = 100;
        System.out.println("El Spartan "+nombre+" recargo su escudo al maximo!");
    }

    @Override
    public void recibirDaño(int daño){
        if(Escudo > 0){
            Escudo = Escudo - daño;
            if(Escudo < 0){
                salud = salud + Escudo;
                Escudo = 0;
                System.out.println("El Spartan "+nombre+" recibio daño, Escudo: "+Escudo+", Salud: "+salud);
            }
        } else {
            super.recibirDaño(daño);
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Escudo: "+Escudo);
    }
}