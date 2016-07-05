package creacionales.abstractfactory;

/**
 * Created by xareas on 6/28/16.
 */
public class AutomovilElectricidad extends Automovil {


    public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Auto de Electricidad");
    }
}
