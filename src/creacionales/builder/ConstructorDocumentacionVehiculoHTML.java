package creacionales.builder;

/**
 * Created by xareas on 6/28/16.
 */
public class ConstructorDocumentacionVehiculoHTML extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoHTML() {
        documentacion = new DocumentacionHtml();
    }


    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "HTML Documento en del Pedido" + nombreCliente;
        documentacion.agregarDocumento(documento);

    }

    @Override
    public void construyeSolictudMatricula(String nombreSolicitante) {
        String documento = "HTML Documento de la Matricula " + nombreSolicitante;
        documentacion.agregarDocumento(documento);
    }
}
