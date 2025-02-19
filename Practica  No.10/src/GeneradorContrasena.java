import java.util.Random;

public class GeneradorContrasena {
    private String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789";
    private String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String especiales = "!@#$%^&*()";
    private int longitud;
    private boolean incluirMayusculas;
    private boolean incluirEspeciales;

    public GeneradorContrasena(int longitud, boolean incluirMayusculas, boolean incluirEspeciales) {
        this.longitud = longitud;
        this.incluirMayusculas = incluirMayusculas;
        this.incluirEspeciales = incluirEspeciales;
    }

    public String generar() {
        String conjunto = caracteres;
        if (incluirMayusculas) conjunto += mayusculas;
        if (incluirEspeciales) conjunto += especiales;

        StringBuilder contrasena = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(conjunto.length());
            contrasena.append(conjunto.charAt(indice));
        }
        return contrasena.toString();
    }
}
