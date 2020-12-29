package euler;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static euler.EulerNine.triplets;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerNineTest {
  @Test
  void finds_pythagorean_triplet_for_1000() {
    ArrayList<Integer> triplets = triplets(1000);
    ArrayList<Integer> expectedResult = new ArrayList(asList(200, 375, 425));
    assertEquals(expectedResult.toString(), triplets.toString());
  }
}
