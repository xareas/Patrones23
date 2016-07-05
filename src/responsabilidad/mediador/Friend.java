package responsabilidad.mediador;

/**
 * Created by xareas on 7/3/16.
 */
 abstract class Friend {

    Mediator mediator;
    String name;

     Friend(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void sendMessageFriend(String msg);
    public abstract void notifyMessage(String msg);
}
