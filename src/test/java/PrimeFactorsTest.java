import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class PrimeFactorsTest {

    @Test
    public void one() {
        assertEquals(Collections.<Integer>emptyList(), PrimeFactors.generate(1));
    }

    @Test
    public void two() {
        assertEquals(Collections.singletonList(2), PrimeFactors.generate(2));
    }

    @Test
    public void three() {
        assertEquals(Collections.singletonList(3), PrimeFactors.generate(3));
    }

    @Test
    public void four() {
        assertEquals(Arrays.asList(2, 2), PrimeFactors.generate(4));
    }

    @Test
    public void eight() {
        assertEquals(Arrays.asList(2, 2, 2), PrimeFactors.generate(8));
    }

}
