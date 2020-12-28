package euler;

import org.junit.jupiter.api.Test;

import static euler.EulerSeven.nthPrime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerSevenTest {

  @Test
  void returns_nth_prime() {
    long nthPrime = nthPrime(10001);
    assertEquals(104743, nthPrime);
  }
}
