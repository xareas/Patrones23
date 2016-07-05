package creacionales.builder;

/**
 * Created by xareas on 6/28/16.
 */
public class DocumentacionPDF extends Documentacion {
    @Override
    public void agregarDocumento(String documento) {
        if(documento.startsWith("PDF"))
            contenido.add(documento);
    }

    @Override
    public void imprime() {
       System.out.println("IMPRIMIENDO PDF");
        for(String s: contenido){
            System.out.println(s);
        }
    }
}
