package responsabilidad.templatemethod;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Carro extends BasicEnginieering {
    @Override
    public void iniciarMarcha() {
        System.out.println("Iniciar Marcha del carro");
    }

    @Override
    public void irAlDestino() {
       System.out.println("Ir a la playa en carro");
    }
}
