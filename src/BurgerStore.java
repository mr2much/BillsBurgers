import factories.SimpleBurgerFactory;

import burgers.Hamburger;

public class BurgerStore {
    SimpleBurgerFactory burgerFactory;

    public BurgerStore(SimpleBurgerFactory burgerFactory) {
        this.burgerFactory = burgerFactory;
    }

    public Hamburger orderHamburger(String type) {
        Hamburger hamburger;

        hamburger = burgerFactory.createHamburger(type);

        hamburger.prepare();
        hamburger.bag();

        return hamburger;
    }
}
