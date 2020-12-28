package euler;

import org.junit.jupiter.api.Test;

import static euler.EulerSix.differenceSumSquaresAndSquaresSum;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerSixTest {
  @Test
  void returns_difference_of_sum_of_squares_of_n_numbers_and_square_of_sum_of_n_numbers() {
    int difference = differenceSumSquaresAndSquaresSum(10);

    assertEquals(2640, difference);
  }
}
