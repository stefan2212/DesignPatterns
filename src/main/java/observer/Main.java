package observer;

public class Main {
    public static void main(String[] args) {
        Observer stefan = new YoutubeUser();
        Observer alex = new YoutubeUser();

        Observable venkatChannel = new YoutubeChannel();
        stefan.subscribe(venkatChannel);
        alex.subscribe(venkatChannel);

        venkatChannel.changeState("Java Lambda Design Patterns");

        System.out.println(stefan.getLatestState());
        System.out.println(alex.getLatestState());

        alex.unsubscribe(venkatChannel);

        venkatChannel.changeState("Do not use Java");
        System.out.println(stefan.getLatestState());
        System.out.println(alex.getLatestState());
    }
}
