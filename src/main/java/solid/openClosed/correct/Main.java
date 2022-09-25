package solid.openClosed.correct;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(new HorrorMovie(),
                                     new ComedyMovie());
        movies.forEach(Movie::makeSound);
    }
}
