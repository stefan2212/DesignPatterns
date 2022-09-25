package observer;

public interface Observer {
    void unsubscribe(Observable observable);
    void subscribe(Observable observable);
    void changeState(final String state);
    String getLatestState();
}
