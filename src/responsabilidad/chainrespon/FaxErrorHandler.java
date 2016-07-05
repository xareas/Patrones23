package responsabilidad.chainrespon;

/**
 * Created by xareas on 7/3/16.
 */
public class FaxErrorHandler implements IReceiver {

    private IReceiver nextReceiver;
    public FaxErrorHandler(IReceiver receiver) {
       nextReceiver = receiver;
    }

    @Override
    public boolean processMessage(Message msg) {
       boolean result =false;
        if(msg.text.contains("FAX")){
           System.out.println(msg.text);
           result = true;
       }
        else{
           if(nextReceiver!=null){
              result =  nextReceiver.processMessage(msg);
           }
       }
        return result;
    }
}
