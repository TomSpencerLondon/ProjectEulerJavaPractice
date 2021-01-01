package euler;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static euler.EulerFifteen.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerFifteenTest {
  @Test
  void returns_lattice_paths_for_n_by_n_grid() {
    BigInteger numberOfPaths = latticePathsCount(20);

    assertEquals(new BigInteger("137846528820"), numberOfPaths);
  }

  @Test
  void returns_factorial() {
    BigInteger factorial = getFactorial(5);

    assertEquals(new BigInteger("120"), factorial);
  }
}
