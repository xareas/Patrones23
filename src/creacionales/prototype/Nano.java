package creacionales.prototype;

/**
 * Created by xareas on 7/2/16.
 */
public class Nano extends BasicCar {
    public Nano(String m){
        modelName = m;
    }

    @Override
    public Nano clone() throws CloneNotSupportedException {
        return (Nano)super.clone();
    }
}
