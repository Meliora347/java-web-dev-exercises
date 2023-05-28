package exercises;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Scanner;

public class Alice {


    public static void main(String[] args) {

        String story = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use of" +
                " a book,' thought Alice 'without pictures or conversation?'";

        System.out.println(story);
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Search story for word: ");
        String findWord= (input.nextLine()).toUpperCase();
        input.close();

        if (story.toUpperCase().contains(findWord)){
            System.out.println("The story contains the word " + findWord);
        }
        else {
            System.out.println("The story does NOT contain " + findWord);
        }
        Integer index = story.toUpperCase().indexOf(findWord);
        Integer length = findWord.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = story.toUpperCase().replace(findWord, "");
        System.out.println(modifiedSentence);

    }

}
