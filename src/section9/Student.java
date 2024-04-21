package section9;

import java.text.DecimalFormat;

public class Student {
    private String first;
    private String last;
    private double gpa;

    public Student(String first, String last, double gpa){
        this.first = first;
        this.last = last;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public String getLast() {
        return last;
    }

    public String toString() {
        DecimalFormat fmt = new DecimalFormat("#.0");
        return first + " " + last + " " + "(GPA: " + fmt.format(gpa) + ")";
    }
}
