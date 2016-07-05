package creacionales.builder;

/**
 * Created by xareas on 6/28/16.
 */
public class DocumentacionHtml extends Documentacion {
    @Override
    public void agregarDocumento(String documento) {
        if (documento.startsWith("HTML"))
            contenido.add(documento);
    }


    @Override
    public void imprime() {
        System.out.println("Imprimiendo HTML");
        for (String s : contenido) {
            System.out.println(s);
        }
    }
}
