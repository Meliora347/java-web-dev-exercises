package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice3 {


        public static void main(String[] args) {

            HashMap<String, Integer> studentsName = new HashMap<>();
            Scanner input = new Scanner(System.in);
            String newStudentName;

            System.out.println("Enter your students (or ENTER to finish):");

            // Get student names and grades
            do {

                System.out.print("Student name: ");
                newStudentName = input.nextLine();

                if (!newStudentName.equals("")) {
                    System.out.print("Student ID: ");
                    Integer newID = input.nextInt();
                    studentsName.put(newStudentName, newID);

                    // Read in the newline before looping back
                    input.nextLine();
                }

            } while(!newStudentName.equals(""));

            // Print class roster
            System.out.println("\nClass roster:");
            double sum = 0.0;

            for (Map.Entry<String, Integer> student : studentsName.entrySet()) {
                System.out.println("Student: " + student.getKey() + "\n" +  "Student ID: (" + student.getValue() + ")");
                sum += student.getValue();
            }

        }
    }


