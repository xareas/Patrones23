package responsabilidad.chainrespon;

/**
 * Created by xareas on 7/3/16.
 */
public class EmailErrorHandler implements IReceiver {
    private IReceiver nextreiver;

    public EmailErrorHandler(IReceiver nextreiver) {
        this.nextreiver = nextreiver;
    }


    @Override
    public boolean processMessage(Message msg) {
       boolean result = false;
        if(msg.text.contains("EMAIL")){
           System.out.println(msg.text);
           result = true;
       }
       else{
           if(nextreiver!=null)
              result = nextreiver.processMessage(msg);
       }
        return result;
    }


}
