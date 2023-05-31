package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sumEven(numbers));

        String greenEggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";


        // split string by space
        String greenEggsStripComma = greenEggs.replace(",", "");
        String greenEggsStripPeriod = greenEggsStripComma.replace(".", "");
        String[] strSplit = greenEggsStripPeriod.split(" ");

        // Now convert string into ArrayList
        ArrayList<String> strList = new ArrayList<String>(
                Arrays.asList(strSplit));

        // Now print the ArrayList
  fiveLettered(strList);
    }

    ;
    public static int sumEven(List<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void fiveLettered(List<String> wordArray) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length: ");
        int num = input.nextInt();
        for (String word : wordArray) {
            if (word.length() == num) {
                System.out.println(word);
            }
        }

    }


}
