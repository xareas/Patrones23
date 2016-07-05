package creacionales.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xareas on 6/29/16.
 */
public abstract class Cliente {
    protected List<Pedido> listPedidos = new ArrayList<>();

    protected abstract Pedido crearPedido(double importe);

    public void nuevoPedido(double importe) {
        Pedido pedido = this.crearPedido(importe);
        if (pedido.valida()) {
            pedido.paga();
            listPedidos.add(pedido);
        }
    }
}
