package responsabilidad.estrategia;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Contexto {

    private IChoice opcion;

    public Contexto(IChoice opcion) {
        this.opcion = opcion;
    }


    public void ExecuteSelectOption(String s1,String s2){
        opcion.myChoice(s1,s2);
    }
}
