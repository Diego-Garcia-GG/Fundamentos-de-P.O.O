public class VerificadorFortaleza {
    public static String verificar(String contrasena) {
        if (contrasena.length() >= 10 && contrasena.matches(".*[A-Z].*") && contrasena.matches(".*[!@#$%^&*()].*")) {
            return "Fuerte";
        } else if (contrasena.length() >= 8) {
            return "Moderada";
        } else {
            return "Débil";
        }
    }
}
