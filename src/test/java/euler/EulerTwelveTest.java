package euler;

import org.junit.jupiter.api.Test;

import static euler.EulerTwelve.firstTriangleNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerTwelveTest {
  @Test
  void returns_first_triangle_number_with_n_factors() {
    int firstTriangleNumber = firstTriangleNumber(500);
    assertEquals(76_576_500, firstTriangleNumber);
  }
}
