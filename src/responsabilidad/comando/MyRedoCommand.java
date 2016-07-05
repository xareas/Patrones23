package responsabilidad.comando;

/**
 * Created by xareas on 7/3/16.
 */
public class MyRedoCommand implements ICommand {

    private Receiver receiver;

    public MyRedoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executeTask() {
        receiver.perfomRedo();
    }
}
