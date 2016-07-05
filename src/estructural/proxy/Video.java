package estructural.proxy;

/**
 * Created by xareas on 6/29/16.
 */
public class Video implements Animacion {


    //region option+command T
    @Override
    public void dibuja() {
        System.out.println("Dibuja la animacion");
    }

    @Override
    public void clic() {
        System.out.println("click");
    }

    public void carga() {
    }

    public void reproduce() {
    }
    //endregion
}
