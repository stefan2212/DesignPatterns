package factory;

public class PizzaQuatroFomargi implements Pizza {
    @Override
    public void bake() {
        System.out.println("Baking quatro formagi. I love cheese!!");
    }
}
