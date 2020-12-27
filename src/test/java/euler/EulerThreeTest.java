package euler;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static euler.EulerThree.largestPrime;
import static euler.EulerThree.list;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerThreeTest {
  @Test
  void primes_below_one_hundred() {
    int[] list = list(100);

    assertEquals(Arrays.toString(new int[]{0}), Arrays.toString(list));
  }

  @Test
  void largest_prime_below_input() {
    int largestPrime = largestPrime(600851475143L);

    assertEquals(6857, largestPrime);
  }
}
