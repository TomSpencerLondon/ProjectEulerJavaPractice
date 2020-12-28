package euler;

public class EulerSix {
  public static int differenceSumSquaresAndSquaresSum(int limit){
    int sumOfSquares = limit * (limit + 1) * (2 * limit + 1) / 6;
    int squareOfSum = (int) Math.pow(limit * (limit + 1) / 2, 2);

    return squareOfSum - sumOfSquares;
  }
}
