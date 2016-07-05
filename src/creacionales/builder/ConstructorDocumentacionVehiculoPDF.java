package creacionales.builder;

/**
 * Created by xareas on 6/28/16.
 */
public class ConstructorDocumentacionVehiculoPDF extends ConstructorDocumentacionVehiculo {


    public ConstructorDocumentacionVehiculoPDF() {
        documentacion = new DocumentacionPDF();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String s = "PDF Construye Solicitud Pedido " + nombreCliente;
        documentacion.agregarDocumento(s);
    }

    @Override
    public void construyeSolictudMatricula(String nombreSolicitante) {
        String s = "PDF Construye matricula del solicitante " + nombreSolicitante;
        documentacion.agregarDocumento(s);
    }
}
