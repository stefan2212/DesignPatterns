package visitor.wrong;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vegetable implements Item {
    private int price;

    @Override
    public void buy(Wallet wallet) {
        if(wallet.getMoney() -price > 0) {
            wallet.setMoney(wallet.getMoney() - price);
        } else {
            System.out.println("Nu am destui bani pentru a cumpara legume");
        }
    }
}
