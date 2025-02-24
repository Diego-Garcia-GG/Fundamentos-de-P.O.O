public class Main {
    public static void main(String[] args) {

        //Crear/Instanciar objeto de una clase (Con constructor)
        Spartan jefeMestro = new Spartan("John",100,100,"Rifle de asalto");
        Spartan reach = new Spartan("Emile",15,0,"Espada de luz");

        //Uso de métodos
        jefeMestro.MostrarInfo();
        jefeMestro.Atacar("Elite");
        jefeMestro.RecargarArma(20);
        jefeMestro.Correr(true);

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();

        reach.MostrarInfo();
        reach.Atacar("John");
        reach.RecargarArma(-10);
        reach.Correr(false);

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();

        //Uso de Getters & Setters
        jefeMestro.setNombre("Diego García");
        jefeMestro.setSalud(100);
        jefeMestro.setEscudo(100);
        jefeMestro.setArmaPrincipal("Agijoneador");
        jefeMestro.MostrarInfo();
        System.out.println(jefeMestro.getNombre());

        jefeMestro.ConsultarCortana();
    }
}//Llave de la clase