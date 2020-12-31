package euler;

public class EulerFourteen {
  public static long numberWithHighestCollatzCount(long limit){
    long result = 0;
    int currentMax = 0;
    long half = limit / 2;
    while(limit > half){
      int count = countOfCollatzFor(limit);
      if (count > currentMax){
        result = limit;
        currentMax = count;
      }
      limit--;
    }
    return result;
  }

  public static int countOfCollatzFor(long number){
    int count = 1;
    while(number > 1){
      if (number % 2 == 0){
        number = number / 2;
      }else {
        number = 3 * number + 1;
      }
      count++;
    }
    return count;
  }
}
