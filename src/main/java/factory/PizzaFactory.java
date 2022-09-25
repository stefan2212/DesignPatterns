package factory;

public class PizzaFactory {
    public static Pizza get(final String country) {
        switch (country) {
            case "RO":
                return new PizzaDiavola();
            case "US":
                return new PizzaQuatroFomargi();
            default:
                return new PizzaMargherita();
        }
    }
}
