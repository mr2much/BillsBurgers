package factories;

import burgers.DeluxeBurger;
import burgers.Hamburger;
import burgers.RegularBurger;
import burgers.VeggieBurger;

public class SimpleBurgerFactory {
    public Hamburger createHamburger(String type) {
        Hamburger hamburger = null;

        if(type.equals("veggie")) {
            hamburger = new VeggieBurger();
        } else if(type.equals("regular")) {
            hamburger = new RegularBurger();
        } else if(type.equals("deluxe")) {
            hamburger = new DeluxeBurger();
        }

        return hamburger;
    }
}
