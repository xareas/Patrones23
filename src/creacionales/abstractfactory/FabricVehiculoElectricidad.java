package creacionales.abstractfactory;

/**
 * Created by xareas on 6/28/16.
 */
public class FabricVehiculoElectricidad implements FabricaVehiculo {

    @Override
    public Automovil createAutomovil(String modelo, String color, int potencia, double espacio) {
       return new AutomovilElectricidad(modelo,color,potencia,espacio);
    }

    @Override
    public Scooter createScooter(String modelo, String color, int potencia) {

        return new ScooterElectricidad(modelo,color,potencia);
    }
}
