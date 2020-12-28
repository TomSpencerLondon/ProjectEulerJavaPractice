package euler;

import java.util.Scanner;

public class EulerSeven {
  public static long nthPrime(int n) {
    int numberOfPrimes = 2;
    long prime = 3;

    while (numberOfPrimes < n){
      prime += 2;
      if (isPrime(prime)) {
        numberOfPrimes++;
      }
    }
    return prime;
  }

  public static boolean isPrime(long n){
    if (n < 2 || n % 2 == 0){
      return false;
    }else if (n == 2) {
      return true;
    }

    for (int i = 3; i <= n / 2; i += 2){
      if (n % i == 0){
        return false;
      }
    }
    return true;
  }
}
