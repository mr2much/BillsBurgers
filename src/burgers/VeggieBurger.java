package burgers;

import ingredients.Ingredients;
import ingredients.breads.BagelBuns;
import ingredients.cheese.GoatCheese;
import ingredients.condiments.Condiment;
import ingredients.condiments.OliveOil;
import ingredients.extras.Extra;
import ingredients.extras.Fries;
import ingredients.meats.Meat;
import ingredients.toppings.CaramelizedOnion;
import ingredients.toppings.Garlic;
import ingredients.toppings.Lettuce;
import ingredients.toppings.Toppings;
import ingredients.veggies.PortobelloMushroom;
import ingredients.veggies.Veggie;

import java.util.ArrayList;

public class VeggieBurger extends Hamburger {
    public VeggieBurger() {
        description = "Veggie Burger";
        bread = new BagelBuns();
        cheese = new GoatCheese();
        meat = new MeatSubstitute(new PortobelloMushroom());
        toppings = new Toppings[] {new CaramelizedOnion(), new Garlic(), new Lettuce()};
        condiments = new Condiment[] { new OliveOil() };
        extras = new ArrayList<>();
        extras.add(new Fries());
        price = 10.00;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + description);
        System.out.println("Grilling " + meat.getDescription() + "...");
        System.out.println("Drizzling " + meat.getDescription() + " in olive oil...");
        System.out.println("Putting " + meat.getDescription() + " in " + bread.getDescription() + "...");
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
}

class MeatSubstitute extends Meat {
    Ingredients ingredient;

    public MeatSubstitute(Ingredients ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String getDescription() {
        return ingredient.getDescription();
    }

    @Override
    public double getPrice() {
        return ingredient.getPrice();
    }
}
