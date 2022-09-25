package observer;

public class YoutubeUser implements Observer {
    private String latestUploadedVideo;

    @Override
    public void unsubscribe(final Observable observable) {
        observable.unsubscribe(this);
    }

    @Override
    public void subscribe(final Observable observable) {
        observable.subscribe(this);
    }

    @Override
    public void changeState(final String state) {
        latestUploadedVideo = state;
    }

    @Override
    public String getLatestState() {
        return latestUploadedVideo;
    }
}
