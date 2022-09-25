package factory;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        System.out.println(currentLocale.getCountry());
        Pizza margherita = new PizzaMargherita();
        margherita.bake();

        Pizza pizza = PizzaFactory.get(currentLocale.getCountry());
        pizza.bake();
        Pizza pizza2 = PizzaFactory.get("IT");
        pizza2.bake();

    }
}
