package euler;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static euler.EulerFour.largestPalindromeProduct;
import static euler.EulerFour.reverse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerFourTest {
  @Test
  void returns_largest_palindrome_product_of_two_3_digit_numbers() {
    long largestPalindromeProduct = largestPalindromeProduct();
    assertEquals(906609, largestPalindromeProduct);
  }

  @Test
  void reverses_a_number() {
    int number = reverse(456);

    assertEquals(654, number);
  }
}
