package euler;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class EulerThree {
  public static int[] list(int n) {
    int[] primes = new int[n];
    primes[0] = 2;
    int count = 1;
    int number = 3;
    boolean numberIsPrime;

    while (count < n){
      numberIsPrime = true;
      for (int i = 1; i < (int)(Math.sqrt(number)); i++) {
        if (number % primes[i] == 0){
          numberIsPrime = false;
          break;
        }
      }
      if (numberIsPrime){
        primes[count] = number;
        count++;
      }
      number = number + 2;
    }
    return primes;
  }

  public static int largestPrime(long number){
    for (int counter = 2; counter <= Math.sqrt(number); counter++){
      if (number % counter == 0){
        number = number / counter;
        counter--;
      }
    }
    return (int) number;
  }
}
