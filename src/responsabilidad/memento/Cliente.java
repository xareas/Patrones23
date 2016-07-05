package responsabilidad.memento;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Cliente {
    public static void main(String[] args){
        Originator originator = new Originator();
        originator.setState("Primero");

        Vigilante caretaker = new Vigilante();
        caretaker.saveMemento(originator.OriginatorMemento());

        originator.setState("estado intermedio del objeto");

        //restaurar el estado
        originator.Revert(caretaker.retriveMemento());
    }
}
