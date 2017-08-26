import java.util.Arrays;

public class Hamburger {
    private Item[] additionals;
    private BreadType breadType;
    private MeatType meatType;

    private String description;
    private double price;
    private int itemCount;

    public Hamburger(String description, BreadType breadRollType, MeatType meatType, double price) {
        this.description = description;
        itemCount = 0;
        additionals = new Item[6];

        breadType = breadRollType;
        this.meatType = meatType;
        this.price = price;
    }

    // TODO: implement the removing of items from the hamburger
    public void addAdditional(Item item) {
        // check if array is almost filled
        if(itemCount >= additionals.length - 2) {
            // double the size of the array
            int newSize = additionals.length * 2;

            // copy all the elements from the old array to the new one
            Item[] temp = Arrays.copyOf(additionals, newSize);

            // make the old array the same as the new one
            additionals = temp;
        }

        additionals[itemCount] = item;
        itemCount++;
    }

    public double getPrice() {
        double result = this.price;
        System.out.println("The base price is " + price);
        System.out.println("The price for " + breadType.getDescription() + " is " +
                    breadType.getPrice());
        result += breadType.getPrice();

        System.out.println("The price for " + meatType.getDescription() + " is " +
                    meatType.getPrice());

        result += meatType.getPrice();

        result += getPriceOfAdditionals();

        return result;
    }

    private double getPriceOfAdditionals() {
        double result = 0;

        for(Item item : additionals) {
            if(item != null) {
                System.out.println("The price for " + item.getDescription() + " is " +
                        item.getPrice());
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
