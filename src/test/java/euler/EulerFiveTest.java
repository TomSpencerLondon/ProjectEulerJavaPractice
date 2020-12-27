package euler;

import org.junit.jupiter.api.Test;

import static euler.EulerFive.smallestMultiple;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerFiveTest {
  @Test
  void finds_smallest_number_that_is_multiple_of_all_numbers_1_to_20() {
    int number = smallestMultiple(20);
    assertEquals(232792560, number);
  }
}
