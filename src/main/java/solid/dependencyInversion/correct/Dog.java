package solid.dependencyInversion.correct;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("ham ham");
    }
}
