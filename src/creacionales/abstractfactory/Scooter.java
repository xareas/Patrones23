package creacionales.abstractfactory;

/**
 * Created by xareas on 6/28/16.
 */
public abstract class Scooter {
    protected String modelo;
    protected String color;
    protected int potencia;

    public Scooter(String modelo,String color,int potencia){
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;

    }

    public abstract void mostrarCaracteristicas();
}
