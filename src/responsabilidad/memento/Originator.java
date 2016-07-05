package responsabilidad.memento;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Originator {


    private String state;
    Memento m;

    public void setState(String state) {
        this.state = state;
    }

    public Memento OriginatorMemento(){
        m = new Memento(state);
        return m;
    }

    public void Revert(Memento m){
        System.out.println("Restaurando al estado anterior");
        state = m.getState();
        System.out.println("Se restauro al estado "+ state);
    }

}
