package system.application;

/**
 * Created by LM on 28/07/2016.
 */
public interface MessageListener {

    public void onMessageReceived(MessageTag tag, String payload);
}