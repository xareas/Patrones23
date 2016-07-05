package creacionales.prototype;

/**
 * Created by xareas on 7/2/16.
 */
public class BasicCar implements Cloneable {

    public String modelName;
    public int price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return  (BasicCar) super.clone();
    }
}
