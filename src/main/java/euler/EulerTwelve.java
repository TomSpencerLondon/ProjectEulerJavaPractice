package euler;

public class EulerTwelve {
  public static int firstTriangleNumber(int numberOfDivisors){
    int indexOfTriangleNumber = 0;
    int triangleNumber = 0;
    int countOfDivisors = 0;

    if (numberOfDivisors == 1){
      return 3;
    }

    while (countOfDivisors <= numberOfDivisors){
      countOfDivisors = 0;
      indexOfTriangleNumber++;
      triangleNumber = triangleNumber(indexOfTriangleNumber);

      for (int i = 1; i <= Math.sqrt(triangleNumber); i++){
        if (triangleNumber % i == 0){
          countOfDivisors++;
        }
      }
      countOfDivisors *= 2;
    }
    return triangleNumber;
  }

  private static int triangleNumber(int n) {
    return n * (n + 1) / 2;
  }
}
