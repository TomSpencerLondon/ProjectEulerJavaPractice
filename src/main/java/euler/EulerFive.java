package euler;

public class EulerFive {
  public static int smallestMultiple(int number){
    int m = 1;
    for (int i = number / 2 + 1; i <= number; i++){
     m = i * (m / gcd(i, m));
    }

    return m;
  }

  static int gcd(int n, int m){
    int remainder = n % m;
    if (remainder == 0){
      return m;
    }

    return gcd(m, remainder);
  }
}
