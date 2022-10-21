package se.lexicon;

import java.util.Scanner;

public class Exercise02 {

  /**
   * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
   * If the element does not exist your method should return -1 as value.
   * Expected output: Index position of number 5 is: 2.
   */
  public static void ex2() {

    int [] numbers = {1, 3, 5, 9 , 11, 21};

    System.out.println("Find index of number: ");
    Scanner scan = new Scanner(System.in);
    int findNumber = scan.nextInt();
    indexOf(numbers, findNumber);
  }

  private static void indexOf(int[] numbers, int findNumber) {
    int targetSpot = -1;
    for(int i = 0; i < numbers.length; i++) {
      if (numbers[i] == findNumber) {
        targetSpot = i;
      }
    }
    System.out.println("The number " + findNumber + " has the index " + targetSpot);
  }


}
