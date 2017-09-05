package burgers;

import ingredients.breads.SesameBuns;
import ingredients.cheese.CheddarCheese;
import ingredients.condiments.Condiment;
import ingredients.condiments.Ketchup;
import ingredients.condiments.Mayonnaise;
import ingredients.extras.Extra;
import ingredients.meats.Beef;
import ingredients.toppings.Lettuce;
import ingredients.toppings.Onion;
import ingredients.toppings.Tomato;
import ingredients.toppings.Toppings;

import java.util.ArrayList;

public class RegularBurger extends Hamburger {
    public RegularBurger() {
        description = "Regular Hamburger";
        bread = new SesameBuns();
        meat = new Beef();
        cheese = new CheddarCheese();
        toppings = new Toppings[] { new Tomato(), new Lettuce(), new Onion() };
        condiments = new Condiment[] { new Mayonnaise(), new Ketchup() };
        extras = new ArrayList<>();
        price = 1.05;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + description);
        System.out.println("Pan Frying " + meat.getDescription() + "...");
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
