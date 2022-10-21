package se.lexicon;

public class Exercise10 {

  /**
   * 10.Write a program which will represent multiplication table stored in multidimensional array.
   * Hint: You have two-dimensional array with values
   * [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
   */
  public static void ex10() {
    int[][] multiTable = new int[10][10];
    for (int i = 0; i < 10; i++){
      for (int j = 0; j < 10; j++){
        multiTable [i][j] = (i + 1) * (j + 1);
        System.out.print(multiTable[i][j] + " ");
      }System.out.println();
    }
  }

}
