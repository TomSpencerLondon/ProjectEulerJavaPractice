package euler;

import java.util.Scanner;

public class EulerSeven {
  public static long nthPrime(int n) {
    int numberOfPrimes = 0;
    long prime = 1;

    while (numberOfPrimes < n){
      prime++;
      if (isPrime(prime)) {
        numberOfPrimes++;
      }
    }
    return prime;
  }

  public static boolean isPrime(long n){
    if (n < 2){
      return false;
    }else if (n == 2) {
      return true;
    }

    for (int i = 2; i < n; i++){
      if (n % i == 0){
        return false;
      }
    }
    return true;
  }
}
