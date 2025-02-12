public class Main {
    public static void main(String[] args) {

        //Crear/Instanciar objeto de una clase
        Spartan jefeMestro = new Spartan();
        Spartan reach = new Spartan();

        //Asignación de valores en los atributos del objeto instanciado
        jefeMestro.nombre = "John";
        jefeMestro.salud = 100;
        jefeMestro.escudo = 100;
        jefeMestro.ArmaPrincipal = "Rifle de asalto";

        reach.nombre = "Emile";
        reach.salud = 15;
        reach.escudo = 0;
        reach.ArmaPrincipal = "Espada de luz";

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
    }
}//Llave de la clase