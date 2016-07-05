package responsabilidad.templatemethod;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Moto extends BasicEnginieering {
    @Override
    public void iniciarMarcha() {
        System.out.println("Iniciar marcha en moto");
    }

    @Override
    public void irAlDestino() {
       System.out.println("Ir a la playa en moto");
    }
}
