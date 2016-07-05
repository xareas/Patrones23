package estructural.decorador;

/**
 * Created by xareas on 7/2/16.
 */
public class Cliente {
    public void  main(){
        ConcretComponent cc = new ConcretComponent();
        CaracteristicaUno ccuno = new CaracteristicaUno(cc);
        ccuno.doJob();
        CaracteristicasDos ccdos = new CaracteristicasDos(cc);
        ccdos.doJob();





    }
}
