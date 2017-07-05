
import sweets.*;

/**
 * Created by K_PC-S on 04.07.2017.
 */
public class Base {

    public static void main(String[] args) {

        Candy candy = new Candy("Fly", 87.34, 200.00, 99);
        Candy candy1 = new Candy("Cow", 104.55, 250.00, 150);
        Cake cake = new Cake("CheeseCake", 1400.00, 500.00, "Awesome Cake");
        Chocolate chocolate = new Chocolate("Milka", 256.89, 500.00, 359);

        System.out.printf("Total weight of the gift %.2f%n",
                ValueOfGift.calculate(candy.getWeight(),candy1.getWeight(),cake.getWeight(),chocolate.getWeight()));
        System.out.printf("Total amount of the gift %.2f%n",
                ValueOfGift.calculate(candy.getPrice(),candy1.getPrice(),cake.getPrice(),chocolate.getPrice()));

        System.out.println("\nGift content:");
        System.out.println(""+candy + "\n" + candy1+"\n"+cake+"\n"+chocolate);
    }
}
