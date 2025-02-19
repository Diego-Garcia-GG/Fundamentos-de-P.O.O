import javax.swing.*;

public class AplicacionContrasena {
    public static void main(String[] args) {
        int longitud = 8; // Valor por defecto
        try {
            longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la contraseña (8 por defecto):"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Se usará 8 caracteres por defecto.");
        }

        boolean incluirMayusculas = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean incluirEspeciales = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        GeneradorContrasena generador = new GeneradorContrasena(longitud, incluirMayusculas, incluirEspeciales);
        String contrasena = generador.generar();
        String fortaleza = VerificadorFortaleza.verificar(contrasena);

        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contrasena + "\nFortaleza: " + fortaleza);
    }
}
