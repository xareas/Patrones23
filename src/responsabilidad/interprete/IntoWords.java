package responsabilidad.interprete;

/**
 * Created by xareas on 7/3/16.
 */
public class IntoWords implements  IExpression {

    @Override
    public void interprete(Context ic) {
       ic.printInWords(ic.getInput());
    }
}
