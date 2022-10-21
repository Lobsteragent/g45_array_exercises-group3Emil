package se.lexicon;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Exercise06 {

  /**
   * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
   * Expected output: Average is: 17.3
   */
  public static void ex6() {
  int[] numbers = {43, 5, 23, 17, 2, 14};
  Arrays.sort(numbers);
    for (int num : numbers) {
    }
    double total = 0;
    for (int i=0; i< numbers.length; i++){
      total = total + numbers[i];
    }
    double average = total / numbers.length;
    DecimalFormat df = new DecimalFormat();
    df.setMaximumFractionDigits(2);
    System.out.println(df.format(average));
  }
}
