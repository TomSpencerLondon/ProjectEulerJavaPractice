package euler;

import org.junit.jupiter.api.Test;

import static euler.EulerSeventeen.count;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerSeventeenTest {
  @Test
  void returns_number_letter_counts_for_all_numbers_to_n() {
    int count = count(1000);
    assertEquals(1, count);
  }
}
