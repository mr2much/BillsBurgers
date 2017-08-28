public class BurgerTester {

    public static void main(String[] args) {
        BreadType regularBread = new BreadType("Regular Bread", .10);
        MeatType regularMeat = new MeatType("Regular Meat", .15);
        Item onions = new Item("Onions", .05);
        Item tomato = new Item("Tomatoes", .13);

        Hamburger regular = new Hamburger("Regular Burger", regularBread, regularMeat,
                .33);

        regular.addAdditional(tomato);
        regular.addAdditional(onions);
        displayBugerInfo(regular);

        HealthyBurger healthy = new HealthyBurger(regularMeat, 10.00);
        Item rocks = new Item("Healthy Rocks", 13.99);

        healthy.addAdditional(rocks);
        displayBugerInfo(healthy);

        DeluxeBurger deluxeBurger = new DeluxeBurger(regularBread, regularMeat, 10.00);

        deluxeBurger.addAdditional(onions);
        displayBugerInfo(deluxeBurger);
    }

    public static void displayBugerInfo(Hamburger burger) {
        burger.display();
        System.out.printf("\t%-30s%5.2f $\n", "Total amount:", burger.getPrice());
    }
}
