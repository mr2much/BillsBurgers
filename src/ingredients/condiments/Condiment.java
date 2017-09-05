package ingredients.condiments;

import ingredients.Ingredients;

public abstract class Condiment implements Ingredients {
    protected String description;
    protected double price;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
