package ingredients.meats;

import ingredients.Ingredients;

public abstract class Meat implements Ingredients{
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
