package responsabilidad.estado;

import java.util.Vector;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Cliente {
    public static void main(String[] args){
        Apagado apagado = new Apagado();
        TV tv = new TV(apagado);
        tv.pressButton();
        tv.pressButton();


    }
}
