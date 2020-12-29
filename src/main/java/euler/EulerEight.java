package euler;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class EulerEight {
  public static long greatestProduct(String number) {
    long largestProduct = 0;
    int adjacentLength = 13;
    for (int i = 0; i < number.length() - adjacentLength + 1; i++) {
      long product = 1;
      for (int j = i; j < i + adjacentLength; j++){
        product *= parseInt(number.substring(j, j + 1));
      }
      if (product > largestProduct){
        largestProduct = product;
      }
    }

    return largestProduct;
  }
}
