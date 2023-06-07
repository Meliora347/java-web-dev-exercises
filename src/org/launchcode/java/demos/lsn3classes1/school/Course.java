package org.launchcode.java.demos.lsn3classes1.school;

import org.launchcode.java.demos.lsn3classes1.Student;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Student> studentRoster;
    private int credits;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getStudentRoster() {
        return studentRoster;
    }

    public void setStudentRoster(ArrayList<Student> studentRoster) {
        this.studentRoster = studentRoster;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
