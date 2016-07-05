package responsabilidad.mediador;

/**
 * Created by xareas on 7/3/16.
 */
public class Cliente {
    public static void main(String[] args){

        ConcreteMediator m = new ConcreteMediator();
        Friend1 amit = new Friend1(m,"Amit");
        Friend2 sohel = new Friend2(m,"Sohel");
        Boss ragu = new Boss(m,"Ragu");

        m.setFriend1(amit);
        m.setFriend2(sohel);
        m.setBoss(ragu);

        amit.sendMessageFriend("mensaje amit");
        sohel.sendMessageFriend("mensaje de sohel");
        ragu.sendMessageFriend("mensaje de ragu");


    }
}
