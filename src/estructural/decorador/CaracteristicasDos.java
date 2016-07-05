package estructural.decorador;

/**
 * Created by xareas on 7/2/16.
 */
public class CaracteristicasDos extends AbstractDecorator {

    public CaracteristicasDos(Componente com) {
        super(com);
    }

    @Override
    public void doJob() {
        super.doJob();
        System.out.println("Agrego la caracteritica numero dos");
    }
}
