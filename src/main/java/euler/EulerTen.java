package euler;

import java.util.Arrays;

public class EulerTen {
  public static long sumOfPrimes(int limit) {
    long sum = 0;
    boolean primes[] = new boolean[limit];
    Arrays.fill(primes, true);
    generatePrimes(primes);
    for (int i = 2; i < limit; i++) {
      if (primes[i]) {
        sum = sum + i;
      }
    }
    return sum;
  }

  private static void generatePrimes(boolean[] primes) {
    int length = primes.length;
    int sqrt = (int) Math.sqrt(length);
    for (int i = 2; i <= sqrt; i++) {
      for (int j = i * i; j < length; j = j + i) {
        primes[j] = false;
      }
    }
  }
}