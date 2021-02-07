import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

}
