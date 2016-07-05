package creacionales.abstractfactory;

/**
 * Created by xareas on 6/28/16.
 */
public interface FabricaVehiculo {
    Automovil createAutomovil(String modelo,String color,int potencia,double espacio);
    Scooter createScooter(String modelo,String color,int potencia);
}
