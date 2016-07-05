package estructural.decorador;

/**
 * Created by xareas on 7/2/16.
 */
public class ConcretComponent extends Componente {
    @Override
    public void doJob() {
        System.out.println("Hago el trabago soy un componente concreto");
    }
}
