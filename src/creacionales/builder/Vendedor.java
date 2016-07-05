package creacionales.builder;

/**
 * Created by xareas on 6/28/16.
 */
public class Vendedor {
    protected ConstructorDocumentacionVehiculo constructor;

    public Vendedor(ConstructorDocumentacionVehiculo constructor) {
        this.constructor = constructor;
    }

    public Documentacion construye(String nombreCliente) {
        constructor.construyeSolicitudPedido(nombreCliente);
        constructor.construyeSolictudMatricula(nombreCliente);
        Documentacion documentacion = constructor.resultado();
        return documentacion;
    }
}
