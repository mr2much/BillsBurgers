public class BurgerTester {

    public static void main(String[] args) {
        Item regularBread = new Item("Regular Bread", .10);
        Item regularMeat = new Item("Regular Meat", .15);
        Item onions = new Item("Onions", .05);
        Item tomato = new Item("Tomatoes", .13);
        Item noItem = new Item("", .00);

        Hamburger regular = new Hamburger(regularBread, regularMeat,
                .33);

        regular.addLettuce(noItem);
        regular.addCheese(noItem);
        regular.addTomato(tomato);
        regular.addOnions(onions);

        System.out.println("A " + regular.getDescription() + " with " + regular.getItemCount() + " extras, is:");
        System.out.format("Total amount: %.2f\n", regular.getPrice());

        HealthyBurger healthy = new HealthyBurger(regularMeat, 50.00);
        Item rocks = new Item("Healthy Rocks", 33.99);

        healthy.addLettuce(noItem);
        healthy.addCheese(noItem);
        healthy.addTomato(noItem);
        healthy.addOnions(noItem);
        healthy.addRocks(rocks);
        healthy.addGrass(noItem);

        System.out.println("A " + healthy.getDescription() + " with " + healthy.getItemCount() + " extras, is:");
        System.out.format("Total amount: %.2f", healthy.getPrice());
    }
}
