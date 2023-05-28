package org.launchcode.java.demos.lsn1datatypes;
import java.util.Scanner;
public class HelloMethods {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter language: sp, fr, or en: ");
        String message = Message.getMessage(input.next());
        input.close();
        System.out.println(message);
    }

}
