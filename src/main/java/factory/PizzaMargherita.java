package factory;

public class PizzaMargherita implements Pizza {
    @Override
    public void bake() {
        System.out.println("Baking Margherita. Simple is the best!!");
    }
}
