package creacionales.factorymethod;

/**
 * Created by xareas on 6/29/16.
 */
public class PedidoContado extends Pedido {

    public PedidoContado(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return true;
    }

    @Override
    public void paga() {
        System.out.println("Se pago de contado el importe");
    }
}
