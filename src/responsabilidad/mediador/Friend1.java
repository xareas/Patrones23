package responsabilidad.mediador;

/**
 * Creado por xareas Fecha 7/3/16.
 */

public class Friend1 extends Friend {
    private String name;

    public Friend1(Mediator mediator,String name) {
        super(mediator);
        this.name = name;
    }


    @Override
    public void sendMessageFriend(String msg) {
        mediator.sendMessageMediator(this,msg);
    }

    @Override
    public void notifyMessage(String msg) {
          System.out.println("Notificando Friend1 " + msg);
    }
}
