public class Conductor {
    private String nombre = "";
    private String identificacion = "";
    private String licencia = "";

    public Conductor(String NOMBRE, String IDENTIFICACION, String LICENCIA) {
        this.nombre = NOMBRE;
        this.identificacion = IDENTIFICACION;
        this.licencia = LICENCIA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getLicencia() {
        return licencia;
    }
}
