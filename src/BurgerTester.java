public class BurgerTester {

    public static void main(String[] args) {
        BreadType regularBread = new BreadType("Regular Bread", .10);
        MeatType regularMeat = new MeatType("Regular Meat", .15);
        Item onions = new Item("Onions", .05);
        Item tomato = new Item("Tomatoes", .13);
        Item noItem = new Item("", .00);

        Hamburger regular = new Hamburger("Regular Burger", regularBread, regularMeat,
                .33);

        regular.addAdditional(tomato);
        regular.addAdditional(onions);

        System.out.println("A " + regular.getDescription() + " with " + regular.getItemCount() + " extras, is:");
        System.out.format("Total amount: %.2f\n", regular.getPrice());

        HealthyBurger healthy = new HealthyBurger(regularMeat, 50.00);
        Item rocks = new Item("Healthy Rocks", 33.99);

        healthy.addAdditional(rocks);

        System.out.println("A " + healthy.getDescription() + " with " + healthy.getItemCount() + " extras, is:");
        System.out.format("Total amount: %.2f\n", healthy.getPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger(regularBread, regularMeat, 10.00);

        deluxeBurger.addAdditional(onions);
        System.out.println("A " + deluxeBurger.getDescription() + " with " +
                        deluxeBurger.getItemCount() + " extras, is:");
        System.out.format("Total amount: %.2f\n", deluxeBurger.getPrice());
    }
}
