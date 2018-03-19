package Lesson5;

/**
 * Created by Seth May on 3/20/2017.
 */
//Lesson 5 Activity 1
public class Student {
    private int grade;
    private double gpa;
    private String fName;
    private String lName;
    private static int num = 1;
    private int sID;

    public Student (String firstName, String lastName, int gradeLevel, double gpavg)
    {

        sID = num;
        num++;
        fName = firstName;
        lName = lastName;

        if(gradeLevel <= 12 && gradeLevel >= 0)
            grade = gradeLevel;
        else
            grade = 0;

        if (gpavg <= 4.5 && gpavg >= 0)
            gpa = gpavg;
        else
            gpa = 0.0;

    }

    public Student ()
    {
        this("None","None",0,0);
    }

    public String toString()
    {
        return lName + ", " + fName + "\nGPA: " + gpa + "\nGrade Level: " + grade + " id # "+ sID;
    }

}
