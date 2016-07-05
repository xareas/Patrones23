package responsabilidad.estrategia;

import java.awt.*;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class FirstChoice implements IChoice {


    @Override
    public void myChoice(String s1, String s2) {
        System.out.println("Implenmento el algorimo de primera opcion " + s1 + s2);
    }
}
