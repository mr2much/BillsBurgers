public class DeluxeBurger extends Hamburger {
    Item chips;
    Item drinks;

    public DeluxeBurger(Item breadRollType, Item meatType, double price){
        super(breadRollType, meatType, price);
        description = "Deluxe Burger";

        chips = new Item("Some Chips", .10);
        drinks = new Item("Coke", .50);
        itemCount = 2;

        this.lettuce = new Item("", 0);
        this.cheese = new Item("", 0);
        this.tomato = new Item("", 0);
        this.onions = new Item("", 0);
    }

    @Override
    public void addLettuce(Item lettuce) {
        System.out.println("Sorry, you cannot add " + lettuce.getDescription() +
            " with this order.");
        super.addLettuce(new Item("", 0));
    }

    @Override
    public void addCheese(Item cheese) {
        System.out.println("Sorry, you cannot add " + cheese.getDescription() +
                " with this order.");
        super.addCheese(new Item("", 0));
    }

    @Override
    public void addTomato(Item tomato) {
        System.out.println("Sorry, you cannot add " + tomato.getDescription() +
                " with this order.");
        super.addTomato(new Item("", 0));
    }

    @Override
    public void addOnions(Item onions) {
        System.out.println("Sorry, you cannot add " + onions.getDescription() +
                " with this order.");
        super.addOnions(new Item("", 0));
    }

    @Override
    public double getPrice() {
        double result = super.getPrice();

        System.out.println("The price for " + this.chips.getDescription() + " is " +
                this.chips.getPrice());
        result += this.chips.getPrice();

        System.out.println("The price for " + this.drinks.getDescription() + " is " +
                this.drinks.getPrice());
        result += this.drinks.getPrice();

        return result;
    }
}
