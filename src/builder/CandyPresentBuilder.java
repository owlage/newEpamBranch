package builder;

import client.Client;
import sweets.Product;
import wrap.Wrap;
import java.util.ArrayList;

public class CandyPresentBuilder extends PresentBuilder {
    @Override
    void buildName() {
        String name = Client.checkInputName();
        present.setName(name);
    }

    @Override
    void buildPrice() {
        System.out.println("По какой цене вы хотите купить подарок?");
        double price = Client.checkInputPrice();
        present.setPrice(price);
    }

    @Override
    void buildWrap() {
        Wrap wrap = Client.chooseWrap();
        present.setWrap(wrap);
    }

    @Override
    void buildProducts() {
        present.setProducts(new ArrayList<Product>());
    }
}
