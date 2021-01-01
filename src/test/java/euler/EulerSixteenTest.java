package euler;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static euler.EulerSixteen.sumOfDigitsOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerSixteenTest {

  @Test
  void returns_sum_of_digits_of_2_to_power_n() {
    BigInteger power = new BigInteger("2").pow(1000);
    int sumOfDigitsOfPower = sumOfDigitsOf(power);
    assertEquals(1366, sumOfDigitsOfPower);
  }
}
