package euler;
import java.math.BigInteger;

public class EulerFifteen {
  public static BigInteger latticePathsCount(int gridHeight) {
    BigInteger totalFactorial = getFactorial(gridHeight + gridHeight);
    BigInteger heightOrWidthFactorial = getFactorial(gridHeight);
    return totalFactorial.divide(heightOrWidthFactorial.multiply(heightOrWidthFactorial));
  }

  public static BigInteger getFactorial(int num) {
    BigInteger result = BigInteger.ONE;
    for (int i = 1; i <= num; i++)
      result = result.multiply(BigInteger.valueOf(i));
    return result;
  }
}
