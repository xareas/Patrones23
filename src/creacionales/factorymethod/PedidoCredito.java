package creacionales.factorymethod;

/**
 * Created by xareas on 6/29/16.
 */
public class PedidoCredito extends Pedido {


    public PedidoCredito(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return true;
    }

    @Override
    public void paga() {
        System.out.println("Se pago el pedido de credito");
    }
}
