package estructural.puente;

/**
 * Created by xareas on 6/30/16.
 */
public class RedColor implements  IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Color rojo con border de " + Integer.toString(border));
    }
}
