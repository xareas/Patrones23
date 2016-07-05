package responsabilidad.mediador;

/**
 * Created by xareas on 7/3/16.
 */
public class ConcreteMediator extends  Mediator {


    private Friend1 friend1;
    private Friend2 friend2;
    private Boss boss;



    //region establecer variables
    public void setFriend1(Friend1 friend1) {
        this.friend1 = friend1;
    }

    public void setFriend2(Friend2 friend2) {
        this.friend2 = friend2;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    @Override
    public void sendMessageMediator(Friend friend, String msg) {
        if(friend == friend1){
            friend2.notifyMessage(msg);
            boss.notifyMessage(msg);
        }
        if(friend == friend2){
            friend1.notifyMessage(msg);
            boss.notifyMessage(msg);
        }
        if(friend == boss){
            friend1.notifyMessage(msg);
            friend2.notifyMessage(msg);
        }

    }



    //endregion
}
