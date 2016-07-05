package responsabilidad.estrategia;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class SecondChoice implements IChoice {
    @Override
    public void myChoice(String s1, String s2) {
        System.out.println("Implemento el algoritmo de segunda opcion "+s1+s2);
    }
}
