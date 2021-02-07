import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<>();

        int remaining = n;
        for (int candidate = 2; candidate <= remaining; candidate++) {
            while (remaining % candidate == 0) {
                factors.add(candidate);
                remaining /= candidate;
            }
        }

        if (remaining > 1) {
            factors.add(remaining);
        }

        return factors;
    }

}
