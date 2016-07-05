package estructural.puente;

/**
 * Created by xareas on 6/30/16.
 */
public abstract class Shape {
    protected IColor color;

    public Shape(IColor color) {
        this.color = color;
    }

    abstract void drawShape(int border);
    abstract void modifyBorder(int border,int increment);
}
