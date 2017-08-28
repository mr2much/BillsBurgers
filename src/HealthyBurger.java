public class HealthyBurger extends Hamburger {

    public HealthyBurger(MeatType meatType, double price) {
        super("Healthy Burger", new BreadType("Brown Rye Bread", 9.00), meatType, price);
    }

}
