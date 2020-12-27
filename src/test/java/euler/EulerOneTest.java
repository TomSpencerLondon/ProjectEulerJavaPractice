package euler;

import org.junit.jupiter.api.Test;

import static euler.EulerOne.sumMultiplesOfThreeAndFive;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerOneTest {
  @Test
  void sum_multiples_three_and_five() {
    int result = sumMultiplesOfThreeAndFive(1000);

    assertEquals(233168, result);
  }
}
