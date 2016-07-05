package creacionales.factorymethod;

/**
 * Created by xareas on 6/29/16.
 */
public abstract class Pedido {
    protected double importe;

    public Pedido(double importe) {
        this.importe = importe;
    }

    public abstract boolean valida();

    public abstract void paga();
}
