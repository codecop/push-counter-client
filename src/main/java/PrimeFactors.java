import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int candidate = 2; candidate <= 3; candidate++)
        while (n % candidate == 0) {
            factors.add(candidate);
            n /= candidate;
        }

        if (n > 1) {
            factors.add(n);
        }

        return factors;
    }

}
