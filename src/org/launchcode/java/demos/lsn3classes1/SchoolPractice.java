package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student myself = new Student();
        myself.setName("Melody");
        myself.setStudentId(12345);
        myself.setNumberOfCredits(1);
        myself.setGpa(4.0);
        System.out.println(myself.getGpa());

    }
}
