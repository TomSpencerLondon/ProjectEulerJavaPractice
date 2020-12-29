package euler;

public class EulerEleven {
  public static int largestProduct(int[][] grid){
    int largest = 0;
    int horizontalProduct = 0;
    int verticalProduct = 0;
    int leftToRightDiagonalProduct = 0;
    int rightToLeftDiagonalProduct = 0;
    for(int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length - 1; j++){
        if (j <= grid[i].length - 4){
          horizontalProduct = getHorizontalProduct(grid[i], j);
        }
        if ( i <= grid.length - 4){
          verticalProduct = getVerticalProduct(grid, i, j);
        }

        if (i <= grid.length - 4 && j <= grid[i].length - 4){
          leftToRightDiagonalProduct = getLeftToRightDiagonalProduct(grid, i, j);
        }

        if (i <= grid.length - 4 && (j - 3) >= 0)
        {
          rightToLeftDiagonalProduct = getRightToLeftDiagonalProduct(grid, i, j);
        }

        largest = getLargest(largest, horizontalProduct, verticalProduct, Math.max(leftToRightDiagonalProduct, rightToLeftDiagonalProduct));
      }
    }

    return largest;
  }

  private static int getRightToLeftDiagonalProduct(int[][] grid, int i, int j) {
    return grid[i][j] * grid[i + 1][j - 1] *
        grid[i + 2][j - 2] * grid[i + 3][j - 3];
  }

  private static int getLeftToRightDiagonalProduct(int[][] grid, int i, int j) {
    return grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3];
  }

  private static int getVerticalProduct(int[][] grid, int i, int j) {
    return grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j];
  }

  private static int getLargest(int largest, int horizontalProduct, int verticalProduct, int diagonalProduct) {
    if (horizontalProduct > largest){
      largest = horizontalProduct;
    }
    if (verticalProduct > largest){
      largest = verticalProduct;
    }

    if (diagonalProduct > largest){
      largest = diagonalProduct;
    }
    return largest;
  }

  private static int getHorizontalProduct(int[] ints, int j) {
    return ints[j] * ints[j + 1] * ints[j + 2] * ints[j + 3];
  }
}
