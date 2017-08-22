public class DeluxeBurger extends Hamburger {
    Item chips;
    Item drinks;

    public DeluxeBurger(Item breadRollType, Item meatType, double price){
        super(breadRollType, meatType, price);
        description = "Deluxe Burger";
    }

    private void addChips(Item chips) {

    }

    private void addDrinks(Item drinks) {

    }
}
