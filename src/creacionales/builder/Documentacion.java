package creacionales.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xareas on 6/28/16.
 */
public abstract class Documentacion {
    protected List<String> contenido = new ArrayList<>();

    public abstract void agregarDocumento(String documento);

    public abstract void imprime();

}
