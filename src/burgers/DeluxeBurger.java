package burgers;

import ingredients.breads.BriocheBuns;
import ingredients.cheese.BrieCheese;
import ingredients.condiments.Condiment;
import ingredients.condiments.Ketchup;
import ingredients.condiments.Mayonnaise;
import ingredients.extras.Coke;
import ingredients.extras.Extra;
import ingredients.extras.Fries;
import ingredients.meats.Chicken;
import ingredients.toppings.Lettuce;
import ingredients.toppings.Onion;
import ingredients.toppings.Tomato;
import ingredients.toppings.Toppings;

import java.util.ArrayList;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        description = "Deluxe Burger";
        bread = new BriocheBuns();
        meat = new Chicken();
        cheese = new BrieCheese();
        toppings = new Toppings[] {new Tomato(), new Onion(), new Lettuce()};
        condiments = new Condiment[] { new Mayonnaise(), new Ketchup() };
        extras = new ArrayList<>();
        extras.add(new Coke());
        extras.add(new Fries());
        price = 10.00;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + description);
        System.out.println("Barbecuing " + meat.getDescription() + "...");
        System.out.println("Putting meat in " + bread.getDescription() + "...");
        System.out.println("Adding " + cheese.getDescription() + "...");

        System.out.println("Adding toppings: ");
        for(Toppings topping : toppings) {
            System.out.println("    " + topping.getDescription());
        }

        System.out.println("Adding condiments: ");
        for(Condiment condiment : condiments) {
            System.out.println("    " + condiment.getDescription());
        }

        System.out.println("Adding extras: ");
        for(Extra extra : extras) {
            System.out.println("    " + extra.getDescription());
        }
    }

    @Override
    public void display() {
        // header
        System.out.println("============================================");
        System.out.println("\tA " + this.getDescription() + " with " + extras.size() +
                " extras, is:");
        System.out.println("============================================");

        // body

        System.out.printf("\t%-30s%5.2f $\n", "Base Price:", price);
        System.out.printf("\t%-30s%5.2f $\n", bread.getDescription() + ":",
                bread.getPrice());
        System.out.printf("\t%-30s%5.2f $\n", meat.getDescription() + ":",
                meat.getPrice());

        System.out.printf("\t%-30s%5.2f $\n", cheese.getDescription() + ":", cheese.getPrice());

        for(Toppings topping : toppings) {
            if(topping != null) {
                System.out.printf("\t%-30s%5.2f $\n", topping.getDescription() + ":",
                        topping.getPrice());
            }
        }

        for(Condiment condiment : condiments) {
            if(condiment != null) {
                System.out.printf("\t%-30s%5.2f $\n", condiment.getDescription() + ":",
                        condiment.getPrice());
            }
        }

        for(Extra extra : extras) {
            if(extra != null) {
                System.out.printf("\t%-30s%5.2f $\n", extra.getDescription() + ":",
                        extra.getPrice());
            }
        }

        System.out.println("============================================");
    }

    @Override
    public void addExtra(Extra extra) {
        System.out.println("Sorry, no additional items can be added to this order.");
    }

}