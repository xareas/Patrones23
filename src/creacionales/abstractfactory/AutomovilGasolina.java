package creacionales.abstractfactory;

/**
 * Created by xareas on 6/28/16.
 */
public class AutomovilGasolina extends Automovil {

    public AutomovilGasolina(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Construyendo automovil gasolina");
    }
}
