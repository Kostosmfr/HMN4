package sweets;

/**
 * Created by K_PC-S on 05.07.2017.
 */
public class ValueOfGift {
    public static double calculate(double... value) {
        double sum = 0.0;
        for (double v : value) {
            sum += v;
        }
        return sum;
    }
}
