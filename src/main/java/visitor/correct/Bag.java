package visitor.correct;

import java.util.LinkedList;
import java.util.List;

public class Bag implements Cart {
    private final List<Item> items;

    public Bag() {
        items = new LinkedList<>();
    }

    @Override
    public void addItem(final Item item) {
        items.add(item);
    }

    @Override
    public Integer getTotalPrice() {
        return items.stream()
                .mapToInt(Item::getPrice)
                .sum();
    }

    @Override
    public void buy(final Wallet wallet) {
        if (wallet.getMoney() < getTotalPrice()) {
            throw new NotEnoughMoneyException("You don't have enough money to buy the products");
        }
    }
}
