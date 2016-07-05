package responsabilidad.comando;

/**
 * Created by xareas on 7/3/16.
 */
public class Cliente {
    public static void main(String[] mensaje){
        Receiver receiver = new Receiver();


        MyUndoCommand cmd = new MyUndoCommand(receiver);
        MyRedoCommand cmdredo = new MyRedoCommand(receiver);

        Invoke invoke = new Invoke();
        invoke.ExecuteCommand(cmd);
        invoke.ExecuteCommand(cmdredo);

    }
}
