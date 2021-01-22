package euler;

public class EulerEighteen {
  public static int topDown(int[][] triangle, int i, int j){
    if(i == triangle.length-2){
      return triangle[i][j] + Math.max(triangle [i+1][j], triangle [i+1][j+1]);
    }else{
      return triangle[i][j] + Math.max(topDown(triangle, i+1, j), topDown(triangle, i+1, j+1));
    }
  }

  public static void bottomUpSum(int[][] triangle){

    for(int i = triangle.length-2; i>=0; i--){
      for(int j = 0; j <= i; j++){

        triangle[i][j] += Math.max(triangle [i+1][j], triangle [i+1][j+1]);
      }
    }
  }
}
