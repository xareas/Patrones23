package responsabilidad.estado;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Prendido extends RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("Apagando la Television...");
        context.setState(new Apagado());
    }
}
