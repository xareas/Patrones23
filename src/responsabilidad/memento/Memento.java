package responsabilidad.memento;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
