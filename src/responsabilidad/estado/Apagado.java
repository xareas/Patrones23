package responsabilidad.estado;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Apagado extends RemoteControl {


    @Override
    public void pressSwitch(TV context) {
        System.out.println("Encendiendo la television");
        context.setState(new Prendido());
    }
}
