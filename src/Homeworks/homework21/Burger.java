package Homeworks.homework21;

import java.util.ArrayList;
import java.util.List;

public class Burger {
    Integer price = 50;

    List<Product> ingredients = new ArrayList<Product>();

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void addIngredient(Product ingredient) {
        ingredients.add(ingredient);
    }

    public List<Product> getIngredients() {
        return ingredients;
    }

    public Integer getPrice() {
        return price;
    }
}
