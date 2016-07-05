package responsabilidad.chainrespon;

public class IssueRaise {
    public IReceiver setFirstReveiver;

    public IssueRaise(IReceiver setFirstReveiver) {
        this.setFirstReveiver = setFirstReveiver;
    }

    public void  raiseMessage(Message msg){
        if(setFirstReveiver!=null)
            setFirstReveiver.processMessage(msg);
    }
}
