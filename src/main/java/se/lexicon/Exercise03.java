package se.lexicon;
import java.text.DecimalFormat;
import java.util.Arrays;
public class Exercise03 {

  /**
   * 3. Write a program which will sort string array.
   * Expected output:
   *                String array: [Paris, London, New York, Stockholm]
   *                Sort string array: [London, New York, Paris, Stockholm]
   */
  public static void ex3() {
        String[] cities = {"Paris", "London", "New York", "Stockholm"};

        Arrays.sort(cities, String.CASE_INSENSITIVE_ORDER);
    System.out.print("[");
    for (String city :cities) {
      System.out.print(city + ", ");
    }
    System.out.print("\b\b");
    System.out.println("]");
    }
  }

