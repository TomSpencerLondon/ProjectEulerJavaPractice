package euler;

import org.junit.jupiter.api.Test;

import static euler.EulerFive.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerFiveTest {
  @Test
  void finds_smallest_number_that_is_multiple_of_all_numbers_1_to_20_with_gcd() {
    int number = smallestMultipleWithGCDFormula(20);
    assertEquals(232792560, number);
  }

  @Test
  void finds_smallest_number_that_is_multiple_of_all_numbers_1_to_20_with_lcm() {
    int number = smallestMultipleWithLCM(20);
    assertEquals(232792560, number);
  }

  @Test
  void gcd_of_20_and_232792560_should_return_20() {
    int gcd = gcd(232792560, 20);
    assertEquals(20, gcd);
  }
}