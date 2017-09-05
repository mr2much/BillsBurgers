import factories.SimpleBurgerFactory;

import burgers.Hamburger;
import ingredients.extras.Bacon;
import ingredients.extras.Coke;
import ingredients.extras.Fries;

public class BurgerTester {

    public static void main(String[] args) {
        SimpleBurgerFactory burgerFactory = new SimpleBurgerFactory();
        BurgerStore regularStore = new BurgerStore(burgerFactory);

        Hamburger regular = regularStore.orderHamburger("regular");
        regular.addExtra(new Bacon());
        regular.addExtra(new Fries());
        regular.addExtra(new Coke());
        displayBugerInfo(regular);

        System.out.println();

        regular = regularStore.orderHamburger("deluxe");
        regular.addExtra(new Bacon());
        displayBugerInfo(regular);

        System.out.println();

        regular = regularStore.orderHamburger("veggie");
        regular.addExtra(new Coke());
        displayBugerInfo(regular);
    }

    public static void displayBugerInfo(Hamburger burger) {
        System.out.println();
        burger.display();
        System.out.printf("\t%-30s%5.2f $\n", "Total amount:", burger.getPrice());
    }
}
