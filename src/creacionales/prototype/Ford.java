package creacionales.prototype;

/**
 * Created by xareas on 7/2/16.
 */
public class Ford extends BasicCar {


    public Ford(String m) {
        modelName = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        return (Ford)super.clone();
    }

}
