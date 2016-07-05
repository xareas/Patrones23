package estructural.adaptador;

import estructural.composite.*;

/**
 * Created by xareas on 7/2/16.
 */
public class Calculator {
   Rectangle rectangle;
    public double getArea(Rectangle rec){
        rectangle = rec;
        return  rectangle.largo * rectangle.ancho;
    }
}
