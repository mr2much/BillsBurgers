public class BurgerTester {

    public static void main(String[] args) {
        Item regularBread = new Item("Regular Bread", .10);
        Item regularMeat = new Item("Regular Meat", .15);
        Item onions = new Item("Onions", .05);
        Item noItem = new Item("", .00);

        Hamburger regular = new Hamburger(regularBread, regularMeat,
                .33);

        regular.addLettuce(noItem);
        regular.addCheese(noItem);
        regular.addTomato(noItem);
        regular.addOnions(onions);

        System.out.println("A " + regular.getDescription() + " is:");
        System.out.format("Total amount: %.2f", regular.getPrice());
    }
}
