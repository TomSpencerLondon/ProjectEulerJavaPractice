package euler;

public class EulerTwo {
  public static int sumOfEvenFibonacci(int limit) {
    int o1, o2;
    int e;

    int maxVal = limit;

    int sum = 0;
    o1 = o2 = 1;
    e = o1 + o2;

    while (e < maxVal){
      sum += e;
      o1 = e + o2;
      o2 = e + o1;
      e = o1 + o2;
    }
    return sum;
  }
}
