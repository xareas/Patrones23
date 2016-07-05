package responsabilidad.interprete;

/**
 * Created by xareas on 7/3/16.
 */
public class StringToBinaryExp implements IExpression {
    private String str;



    @Override
    public void interprete(Context ic) {
       str = ic.getInput();
        ic.getBinaryFrom(str);
    }
}
