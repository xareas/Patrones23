package estructural.decorador;

/**
 * Created by xareas on 7/2/16.
 */
public class CaracteristicaUno extends AbstractDecorator {

    public CaracteristicaUno(Componente com) {
        super(com);
    }

    @Override
    public void doJob(){
         super.doJob();
        System.out.println("agrego nueva cosas");
    }
}
