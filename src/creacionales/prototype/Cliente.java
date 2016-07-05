package creacionales.prototype;

/**
 * Created by xareas on 7/2/16.
 */
public class Cliente {
    public void main() throws CloneNotSupportedException {
        Nano nano = new Nano("SOY UN NANO");
        nano.setPrice(100);

        Nano nano2 = nano.clone();
    }
}
