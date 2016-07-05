package creacionales.abstractfactory;

/**
 * Created by xareas on 6/28/16.
 */
public class ScooterGasolina extends Scooter {

    public ScooterGasolina(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("soy un scooter de gasolina");
    }
}
