public class HealthyBurger extends Hamburger {

    Item rocks;
    Item grass;

    public HealthyBurger(Item meatType, double price) {
        super(new Item("Brown Rye Bread", 99.00), meatType, price);
        description = "Healthy Burger";
    }

    public void addRocks(Item rocks) {
        this.rocks = rocks;

        if(rocks.getPrice() > 0) {
            itemCount++;
        }
    }

    public void addGrass(Item grass) {
        this.grass = grass;

        if(grass.getPrice() > 0) {
            itemCount++;
        }
    }

    @Override
    public double getPrice() {
        double result = super.getPrice();

        System.out.println("The price for " + this.rocks.getDescription() + " is " +
                this.rocks.getPrice());
        result += this.rocks.getPrice();

        System.out.println("The price for " + this.grass.getDescription() + " is " +
                this.grass.getPrice());
        result += this.grass.getPrice();

        return result;
    }
}
