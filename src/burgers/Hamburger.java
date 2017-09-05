package burgers;

import ingredients.breads.Bread;
import ingredients.cheese.Cheese;
import ingredients.condiments.Condiment;
import ingredients.extras.Extra;
import ingredients.meats.Meat;
import ingredients.toppings.Toppings;

import java.util.List;

public abstract class Hamburger {
    String description;

    protected Bread bread;
    protected Meat meat;
    protected Cheese cheese;
    protected Toppings[] toppings;
    protected Condiment[] condiments;
    protected List<Extra> extras;

    protected double price;

    public void addExtra(Extra extra) {
        extras.add(extra);
    }

    public abstract void prepare();

    public void bag() {
        System.out.println("Put Hamburger inside Official Bill's Burgers bag");
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract void display();

    public double getPrice() {
        double result = this.price;

        result += bread.getPrice();
        result += meat.getPrice();
        result += getPriceOfExtras();

        return result;
    }

    private double getPriceOfExtras() {
        double result = 0;

        for(Extra extra : extras) {
            if(extra != null) {
                result += extra.getPrice();
            }
        }

        return result;
    }
}
