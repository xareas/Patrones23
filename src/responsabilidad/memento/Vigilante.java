package responsabilidad.memento;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Vigilante {
    private Memento _memento;

    public void saveMemento(Memento m){
        _memento = m;
    }

    public Memento retriveMemento(){
        return _memento;
    }
}
