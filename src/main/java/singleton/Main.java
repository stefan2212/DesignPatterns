package singleton;

public class Main {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "a";
        System.out.println(s1==s2);

        SingletonClass class1 = SingletonClass.getInstance();
        class1.setA(5);
        SingletonClass class2 = SingletonClass.getInstance();
        class2.setA(1);
        System.out.println(class1 == class2);
        System.out.println(class2.getA());
        System.out.println(class1.getA());

        //I want to use the databse
        ConfigurationClass config = ConfigurationClass.getInstance();
        config.setUsername("Stefan");
        config.setDatabaseUrl("https://mydatabase:443");

        config.getDataBaseUrl();
        config.getDataBaseUsername();

        DatabaseCaller caller = new DatabaseCaller();
        caller.doSomething();

        System.out.println(CoffeeShop.COFFEE);
    }
}
