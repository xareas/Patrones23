package creacionales.singleclass;

/**
 * Created by xareas on 6/28/16.
 */
public class Singleton {


    private static class Holder {
        static Singleton instance = new Singleton();
    }


    public static Singleton instance() { // Note: "synchronized" not needed
        return Holder.instance;
    }

}
