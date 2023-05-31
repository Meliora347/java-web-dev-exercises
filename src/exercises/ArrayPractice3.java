package exercises;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;

public class ArrayPractice3 {

    public static void main(String[] args){
        int[] myArr = {1, 1, 2, 3, 5, 8};


//        Arrays.stream(myArr).forEach(i -> i % 2 > 0 ? System.out.println(i) : return;);_
        for(int num : myArr){
            if(num % 2 >0){
            System.out.println(num);}}

            String greenEggs = "I would not, could not, in a box. " +
                    "I would not, could not with a fox. " +
                    "I will not eat them in a house. " +
                    "I will not eat them with a mouse.";

            String[] words = greenEggs.split(" ");

            System.out.println(Arrays.toString(words));

        String[] sentences = greenEggs.split("\\.");

        System.out.println(Arrays.toString(sentences));


        }
    }


