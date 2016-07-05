package estructural.puente;

/**
 * Created by xareas on 6/30/16.
 */
public class Rectangle extends Shape {
    public Rectangle(IColor color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
       drawShape(border*increment);
    }
}
