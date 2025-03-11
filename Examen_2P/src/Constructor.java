import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class Constructor {
    StringBuilder S = new StringBuilder();
    Random R = new Random();

    protected String anioc = "";
    protected String nombre = "";
    protected String app = "";
    protected String apm = "";
    protected String anio = "";
    protected String carrera = "";

    public Constructor(String ANIOC, String NOMBRE, String APP, String APM, String ANIO, String CARRERA){
        this.anioc = ANIOC;
        this.nombre = NOMBRE;
        this.app = APP;
        this.apm = APM;
        this.anio = ANIO;
        this.carrera = CARRERA;
    }

    public void generarMatricula(){
        for(int i=2;i<anioc.length();i++){
            S.append(anioc.charAt(i));
        }
        for(int i=2;i<anio.length();i++){
            S.append(anio.charAt(i));
        }
        S.append(nombre.charAt(0));
        S.append(app.charAt(0));
        S.append(apm.charAt(0));
        for(int i=0;i<3;i++){
            S.append(R.nextInt(0,9));
        }
        S.append(carrera.substring(0,3));
    }

    public void mostrarMatricula(){
        JOptionPane.showMessageDialog(null, "Su matrícula es: "+S);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
