package responsabilidad.chainrespon;

/**
 * Created by xareas on 7/3/16.
 */
public class NetworkErrorHandler implements IReceiver {
    private IReceiver nextReceiver;

    public NetworkErrorHandler(IReceiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }


    @Override
    public boolean processMessage(Message msg) {
        boolean result = false;
        if (msg.text.contains("NET")) {
            System.out.println(msg.text);
            result = true;
        } else {
            if (nextReceiver != null) {
                result = nextReceiver.processMessage(msg);
            }
        }
        return result;
    }
}
