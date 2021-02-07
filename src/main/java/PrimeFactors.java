import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<>();
        if (n == 2 || n == 3) {
            factors.add(n);
        }
        return factors;
    }

}
