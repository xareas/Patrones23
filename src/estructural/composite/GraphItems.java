package estructural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xareas on 7/1/16.
 */
public class GraphItems implements Graphic {
    /**
     * Listado de graficos
     */
    private List<Graphic> graphics = new ArrayList<>();

    /**
     * Listado de graficos
     * @return el listado de graficos a imprimir
     */
    public List<Graphic> getGraphics() {
        return graphics;
    }

    /**
     * dibuja todos los graficos
     */
    @Override
    public void draw() {
       for(Graphic graphic : graphics){
           graphic.draw();
       }
    }
}
