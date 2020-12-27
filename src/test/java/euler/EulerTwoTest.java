package euler;

import org.junit.jupiter.api.Test;

import static euler.EulerTwo.sumOfEvenFibonacci;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerTwoTest {
  @Test
  void sum_of_even_fibonacci_numbers() {
    int sum = sumOfEvenFibonacci(10);

    assertEquals(10, sum);
  }
}
