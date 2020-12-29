package euler;

import org.junit.jupiter.api.Test;
import static euler.EulerTen.sumOfPrimes;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerTenTest {

  @Test
  void returns_list_of_primes() {
    long sum = sumOfPrimes(2_000_000);
    long expectedResult = 142913828922L;
    assertEquals(expectedResult, sum);
  }
}
