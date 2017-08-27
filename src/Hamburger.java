import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    private List<Item> additionals;
    private BreadType breadType;
    private MeatType meatType;

    private String description;
    private double price;
    private int itemCount;

    public Hamburger(String description, BreadType breadRollType, MeatType meatType, double price) {
        this.description = description;
        itemCount = 0;
        additionals = new ArrayList<>();

        breadType = breadRollType;
        this.meatType = meatType;
        this.price = price;
    }

    // TODO: implement the removing of items from the hamburger
    // DONE: separate the parts of the code that don't belong in this method
    // DONE: implement a separate "view" for the items
    public void addAdditional(Item item) {
        additionals.add(item);
        itemCount++;
    }

    public void display() {
        // header
        System.out.println("============================================");
        System.out.println("\tA " + this.getDescription() + " with " + this.getItemCount() +
                " extras, is:");
        System.out.println("============================================");

        // body

        System.out.printf("\tBase price:\t\t\t\t\t$%.2f\n", price);
        System.out.printf("\t%s:\t\t\t\t$%.2f\n", breadType.getDescription(),
                breadType.getPrice());
        System.out.println("The price for " + meatType.getDescription() + " is " +
                meatType.getPrice());

        for(Item item : additionals) {
            if(item != null) {
                System.out.println("The price for " + item.getDescription() + " is " +
                        item.getPrice());
            }
        }

    }

    public double getPrice() {
        double result = this.price;

        result += breadType.getPrice();
        result += meatType.getPrice();
        result += getPriceOfAdditionals();

        return result;
    }

    private double getPriceOfAdditionals() {
        double result = 0;

        for(Item item : additionals) {
            if(item != null) {
                result += item.getPrice();
            }
        }

        return result;
    }

    public String getDescription() {
        return description;
    }

    public int getItemCount() {
        return itemCount;
    }
}
