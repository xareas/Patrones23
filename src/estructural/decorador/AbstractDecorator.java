package estructural.decorador;

/**
 * Created by xareas on 7/2/16.
 */
public class AbstractDecorator extends Componente {

    protected Componente com;

    public AbstractDecorator(Componente com) {
        this.com = com;
    }

    @Override
    public void doJob() {
        if(com!=null)
            com.doJob();
    }

}
