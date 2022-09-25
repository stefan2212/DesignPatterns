package visitor.correct;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fruit implements Item {
    private int price;

    @Override
    public void addToCart(final Cart cart) {
        cart.addItem(this);
    }

    @Override
    public Integer getPrice() {
        return price;
    }
}
