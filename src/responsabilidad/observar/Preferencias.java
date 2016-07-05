package responsabilidad.observar;

import java.util.Observable;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Preferencias extends Observable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        setChanged();
        notifyObservers(color);
    }
}
