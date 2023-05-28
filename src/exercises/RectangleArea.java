package exercises;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Length of Rectangle: ");
        Integer length= input.nextInt();

        System.out.println("Width of Rectangle: ");
        Integer width= input.nextInt();
        input.close();
        Integer area = width*length;

        System.out.println("The Area of the rectangle is: " +area);
    }

}
