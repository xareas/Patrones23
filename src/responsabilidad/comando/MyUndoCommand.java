package responsabilidad.comando;

/**
 * Created by xareas on 7/3/16.
 */
public class MyUndoCommand implements  ICommand {

    private Receiver receiver;

    public MyUndoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeTask() {
       receiver.perfomUndo();
    }
}
