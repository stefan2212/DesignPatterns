package observer;

import java.util.LinkedList;
import java.util.List;

public class YoutubeChannel implements Observable {
    private final List<Observer> subscribers;
    private String lastUploadedVideo;

    public YoutubeChannel() {
        subscribers = new LinkedList<>();
        lastUploadedVideo = "";
    }

    @Override
    public void subscribe(final Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(final Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(x-> x.changeState(this.lastUploadedVideo));
    }

    @Override
    public void changeState(final String state) {
        lastUploadedVideo = state;
        notifySubscribers();
    }
}
