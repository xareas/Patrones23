package estructural.composite;

/**
 * Created by xareas on 7/1/16.
 */
public class Cliente {
    public void main(){

        Line linea = new Line();
        Rectangle rect = new Rectangle();

        GraphItems items= new GraphItems();
        items.getGraphics().add(linea);
        items.getGraphics().add(rect);
        items.draw();
    }
}
