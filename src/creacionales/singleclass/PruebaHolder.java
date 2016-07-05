package creacionales.singleclass;

public class PruebaHolder {

    private PruebaHolder(){}

    private static class Holder {
        static PruebaHolder instance = new PruebaHolder();
    }


    public static PruebaHolder instance() { // Note: "synchronized" not needed
        return Holder.instance;
    }

}