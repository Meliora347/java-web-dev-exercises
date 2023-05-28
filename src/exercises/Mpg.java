package exercises;

import java.util.Scanner;

public class Mpg {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Amount of Miles Driven: ");
        Double miles= input.nextDouble();

        System.out.println("Gallons of Gas Consumed: ");
        Double gallons= input.nextDouble();
        input.close();
        Double mpg = miles/gallons;

        System.out.println("Your car's mpg is: " + mpg + " miles per gallon");
    }

}
