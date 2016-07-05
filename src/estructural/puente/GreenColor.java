package estructural.puente;

/**
 * Created by xareas on 6/30/16.
 */
public class GreenColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Imprimir color verde con border de" + border);
    }
}
