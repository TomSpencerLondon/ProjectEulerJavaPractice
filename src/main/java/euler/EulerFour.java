package euler;

public class EulerFour {
  public static long largestPalindromeProduct(){
    int maxNumber = 999;
    long maxAnswer = 0;
    for(int i = maxNumber; i >=99; i--) {
      for(int j = maxNumber; j >=99; j--) {
        long possibleAnswer = i * j;
        if(possibleAnswer == reverse(possibleAnswer) && possibleAnswer > maxAnswer) {
          maxAnswer = possibleAnswer;
        }
      }
    }

    return maxAnswer;
  }

  public static int reverse(long n){
    int r = 0;
    while (n != 0){
      r = (int) (r * 10 + (n % 10));
      n /= 10;
    }

    return r;
  }
}