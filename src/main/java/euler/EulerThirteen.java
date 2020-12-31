package euler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class EulerThirteen {
  public static String largeNumber(String input) {
    List<String> numbers = new ArrayList();
    List<BigInteger> bigIntNumbers = new ArrayList<>();
    int index = 0;
    while (index < input.length()) {
      numbers.add(input.substring(index, Math.min(index + 50, input.length())));
      index += 50;
    }


    numbers.forEach((number) -> {
      BigInteger amount = new BigInteger(number);
      bigIntNumbers.add(amount);
    });

    BigInteger sum = BigInteger.ZERO;
    for (int i = 0; i < bigIntNumbers.size(); i++){
      sum = sum.add(bigIntNumbers.get(i));
    }

    return sum.toString().substring(0, 10);

  }
}
