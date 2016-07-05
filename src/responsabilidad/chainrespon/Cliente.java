package responsabilidad.chainrespon;

/**
 * Created by xareas on 7/3/16.
 */
public class Cliente {

    public static void main(String[] args){
        IReceiver faxHandler,emailHandler, netHandler;
        emailHandler = new EmailErrorHandler(null); //ultimo de la pila
        faxHandler = new FaxErrorHandler(emailHandler); //penultimo en la pila
        netHandler = new NetworkErrorHandler(faxHandler); //primero en la pila

        IssueRaise raiser = new IssueRaise(netHandler);
        Message m1= new Message("FAX, esto es un mensaje enviado al fax nada mas",MessagePriority.High);
        Message m2= new Message("EMAIL, esto es un correo debio de pasar antes por fax",MessagePriority.Normal);
        Message m3= new Message("NET, esto es un mensaje de la red local de la empresa",MessagePriority.Normal);

        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
    }
}
