public class Main {
    public static void main(String[] args) {
        SpartanII jefeMaetro = new SpartanII("John",100,"Rifle de asalto",0);
        jefeMaetro.mostrarInfo();
        jefeMaetro.usarManejoAvanzado();
        jefeMaetro.atacar("Covenant");
        jefeMaetro.recibirDaño(50);
        jefeMaetro.recargarEscudo();

        System.out.println("\n\n");

        SpartanIII jefeMaestro = new SpartanIII("Joyce",75,"Agijoneador",0);
        jefeMaestro.mostrarInfo();
        jefeMaestro.camuflajeActivo();
        jefeMaestro.atacar("Covenant");
        jefeMaestro.recibirDaño(70);
        jefeMaestro.recargarEscudo();

        System.out.println("\n\n");

        SpartanIV JefeMaestro = new SpartanIV("Michael",100,"Pistola",0);
        JefeMaestro.mostrarInfo();
        JefeMaestro.usaPropulsores();
        JefeMaestro.atacar("Covenant");
        JefeMaestro.recibirDaño(200);
    }
}