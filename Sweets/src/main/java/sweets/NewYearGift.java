package sweets;

/**
 * Created by K_PC-S on 05.07.2017.
 */
public abstract class NewYearGift {

    private String nameSweets;
    private double price;
    private double weight;

    public NewYearGift(String name, double price, double weight) {
        setName(nameSweets);
        setPrice(price);
        setWeight(weight);
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return nameSweets;
    }

    private void setName(String nameSweets) {
        this.nameSweets = nameSweets;
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", weight = " + getWeight() + ", price = " + getPrice();
    }
}
