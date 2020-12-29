package euler;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.sqrt;
import static java.util.Arrays.asList;

public class EulerNine {
  public static ArrayList<Integer> triplets(int number) {
    ArrayList result = new ArrayList();

    int limit = number / 2;
    for (int a = 1; a < limit; a++) {
      for (int b = a; b < limit; b++) {
        double c = sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        if (c < limit && (c % 1 == 0)) {
          if (a + b + c == 1000) {
            ArrayList<Integer> list = new ArrayList(asList(a, b, (int) c));
            Collections.sort(list);
            result = list;
          }
        }
      }

    }

    return result;
  }
}
