import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

public class PrimeFactorsTest {

    @Test
    public void one() {
        assertEquals(Collections.<Integer>emptyList(), PrimeFactors.generate(1));
    }

}
