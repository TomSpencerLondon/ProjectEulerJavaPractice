package euler;

import org.junit.jupiter.api.Test;

import static euler.EulerFourteen.countOfCollatzFor;
import static euler.EulerFourteen.numberWithHighestCollatzCount;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerFourteenTest {
  @Test
  void returns_number_with_highest_count_for_collatz_of_numbers_below_n() {
    long numberWithHighestCollatzCount = numberWithHighestCollatzCount(1_000_000);
    assertEquals(837799, numberWithHighestCollatzCount);
  }

  @Test
  void returns_count_for_collatz_of_number() {
    int collatzCount = countOfCollatzFor(13L);
    assertEquals(10, collatzCount);
  }
}
