package responsabilidad.comando;

/**
 * Created by xareas on 7/3/16.
 */
public class Invoke {

    ICommand cmd;

    public void ExecuteCommand(ICommand cmd){
        this.cmd = cmd;
        cmd.executeTask();
    }
}
