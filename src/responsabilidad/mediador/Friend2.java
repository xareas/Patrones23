 package responsabilidad.mediador;

/**
 * Created by xareas on 7/3/16.
 */
public class Friend2 extends Friend {


    public Friend2(Mediator mediator,String name) {
        super(mediator);
        this.name = name;
    }


    @Override
    public void sendMessageFriend(String msg) {
        mediator.sendMessageMediator(this,msg);
    }

    @Override
    public void notifyMessage(String msg) {
       System.out.println("Mensaje de Friend2: "+ msg);
    }
}
