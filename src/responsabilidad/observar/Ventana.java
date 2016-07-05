package responsabilidad.observar;

import java.util.Observable;
import java.util.Observer;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Ventana implements Observer {


    public Ventana(Observable observable) {
        observable.addObserver(this);
    }

    public String getColor() {
        return color;
    }

    private String color;

    @Override
    public void update(Observable o, Object arg) {
            Preferencias pref = (Preferencias) o;
            String newColor = (String)arg;
            color = newColor;//pref.getcolor()
    }
}
