public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(BreadType breadRollType, MeatType meatType, double price){
        super("Deluxe Burger", breadRollType, meatType, price);

        super.addAdditional(new Item("Some Chips", .10));
        super.addAdditional(new Item("Coke", .50));
    }

    @Override
    public void addAdditional(Item item) {
        System.out.println("Sorry, no additional items can be added to this order.");
    }

}
