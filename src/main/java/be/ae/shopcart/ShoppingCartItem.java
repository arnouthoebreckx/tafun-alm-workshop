package be.ae.shopcart;

import java.io.Serializable;

public class ShoppingCartItem implements Serializable {
    public String name;
    public Double price;

    public ShoppingCartItem() {}
    public ShoppingCartItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShoppingCartItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
