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

    public String getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }

    public String getMayusculas() {
        return mayusculas;
    }

    public void setMayusculas(String mayusculas) {
        this.mayusculas = mayusculas;
    }

    public String getEspeciales() {
        return especiales;
    }

    public void setEspeciales(String especiales) {
        this.especiales = especiales;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isIncluirMayusculas() {
        return incluirMayusculas;
    }

    public void setIncluirMayusculas(boolean incluirMayusculas) {
        this.incluirMayusculas = incluirMayusculas;
    }

    public boolean isIncluirEspeciales() {
        return incluirEspeciales;
    }

    public void setIncluirEspeciales(boolean incluirEspeciales) {
        this.incluirEspeciales = incluirEspeciales;
    }
}
