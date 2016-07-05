package creacionales.builder;

/**
 * Created by xareas on 6/28/16.
 */
public abstract class ConstructorDocumentacionVehiculo {
    protected Documentacion documentacion;

    public abstract void construyeSolicitudPedido(String nombreCliente);

    public abstract void construyeSolictudMatricula(String nombreSolicitante);

    public Documentacion resultado() {
        return documentacion;
    }
}
