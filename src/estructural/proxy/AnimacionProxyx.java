package estructural.proxy;

/**
 * Created by xareas on 6/29/16.
 */
public class AnimacionProxyx implements Animacion {
    protected Video video;
    protected String foto = "mostrar foto";

    @Override
    public void dibuja() {
        if (video != null)
            video = new Video();
        video.dibuja();
    }

    @Override
    public void clic() {
        if (video != null)
            video = new Video();
        video.clic();
    }
}
