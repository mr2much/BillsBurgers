public class Hamburger {

    Item breadRollType;
    Item meatType;
    Item lettuce;
    Item cheese;
    Item tomato;
    Item onions;

    String description;
    private double price;
    int itemCount;

    public Hamburger(Item breadRollType, Item meatType, double price) {
        this.description = "Regular Burger";
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.price = price;
    }

    public void addLettuce(Item lettuce) {
        this.lettuce = lettuce;

        if(lettuce.getPrice() > 0) {
            itemCount++;
        }
    }

    public void addCheese(Item cheese) {
        this.cheese = cheese;

        if(cheese.getPrice() > 0) {
            itemCount++;
        }
    }

    public void addTomato(Item tomato) {
        this.tomato = tomato;

        if(tomato.getPrice() > 0) {
            itemCount++;
        }
    }

    public void addOnions(Item onions) {
        this.onions = onions;

        if(onions.getPrice() > 0) {
            itemCount++;
        }
    }

    public double getPrice() {
        double result = this.price;
        System.out.println("The base price is " + price);
        System.out.println("The price for " + this.breadRollType.getDescription() + " is " +
                this.breadRollType.getPrice());
        result += this.breadRollType.getPrice();

        System.out.println("The price for " + this.meatType.getDescription() + " is " +
                this.meatType.getPrice());
        result += this.meatType.getPrice();

        if(this.lettuce.getPrice() > 0) {
            System.out.println("The price for " + this.lettuce.getDescription() + " is " +
                                this.lettuce.getPrice());
            result += this.lettuce.getPrice();
        }

        if(this.cheese.getPrice() > 0) {
            System.out.println("The price for " + this.cheese.getDescription() + " is " +
                                this.cheese.getPrice());

            result += this.cheese.getPrice();
        }

        if(this.tomato.getPrice() > 0) {
            System.out.println("The price for " + this.tomato.getDescription() + " is " +
                                this.tomato.getPrice());

            result += this.tomato.getPrice();
        }

        if(this.onions.getPrice() > 0) {
            System.out.println("The price for " + this.onions.getDescription() + " is " +
                    this.onions.getPrice());
            result += this.onions.getPrice();
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
