package euler;

import java.math.BigInteger;

public class EulerSixteen {

  public static int sumOfDigitsOf(BigInteger power){
    return power.toString()
        .chars()
        .reduce(0, (result, element) -> result + Character.getNumericValue(element));
  }
}
