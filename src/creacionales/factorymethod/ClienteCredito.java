package creacionales.factorymethod;

/**
 * Created by xareas on 6/29/16.
 */
public class ClienteCredito extends Cliente {

    @Override
    protected Pedido crearPedido(double importe) {
        return new PedidoCredito(1000);
    }
}
