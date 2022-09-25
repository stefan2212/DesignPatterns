package factory;

public class PizzaDiavola implements Pizza {
    @Override
    public void bake() {
        System.out.println("Baking Diavola. Let's spice things up!!");
    }
}
