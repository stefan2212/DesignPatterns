package solid.liskov;

public class Main {
    public static void main(String[] args) {
        Movie movie = new ComedyMovie();
        movie = new HorrorMovie();
    }
}
