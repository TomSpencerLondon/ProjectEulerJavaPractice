package euler;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class EulerSeventeen {
  public static String numberToEnglish(int number) {
    ArrayList<String> ones = new ArrayList<>(
        asList(
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen"));

    ArrayList<String> tens = new ArrayList<>(
        asList(
            "zeros", "tens", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"));

    if (betweenOneAndTwenty(number)) {
      return ones.get(number);
    } else if (isTensBetweenTwentyAndNinety(number, 20, 90, 10)) {
      return tens.get(number / 10);
    } else if (isOnesBetweenTwentyAndHundred(number)) {
      return tens.get(number / 10) + " " + ones.get(number % 10);
    } else if (isHundredUpToNineHundred(number)) {
      return ones.get(number / 100) + " hundred";
    } else if (number > 100 && number < 1000) {
      return ones.get(number / 100) + " hundred and " + numberToEnglish(number % 100);
    } else if (number == 1000) {
      return "one thousand";
    }else {
      throw new UnsupportedOperationException("Unexpected input");
    }
  }

  private static boolean isHundredUpToNineHundred(int number) {
    return (number >= 100 && number <= 900) && (number % 100 == 0);
  }

  private static boolean isOnesBetweenTwentyAndHundred(int number) {
    return number > 20 && number < 100;
  }

  private static boolean isTensBetweenTwentyAndNinety(int number, int i, int i2, int i3) {
    return (number >= i && number <= i2) && number % i3 == 0;
  }

  private static boolean betweenOneAndTwenty(int number) {
    return number >= 0 && number < 20;
  }

  public static int count(int target){
    int result = 0;
    for (int i = 0; i < target; i++){
      String words = numberToEnglish(i + 1)
          .replace(" ", "")
          .replace("zeros", "")
          .replace("tens", "");
      result += words.length();
    }
    return result;
  }
}
