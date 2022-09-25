package visitor.correct;

public interface Cart {
    void addItem(Item item);

    Integer getTotalPrice();

    void buy(Wallet wallet);
}
