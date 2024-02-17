package Section3;

public class Student {
    // Private member field
    private String name;
    private double gpa;

    // Default constructor
    public Student(){
        name = "Louie";
        gpa = 1.0;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setGPA(double g){
        gpa = g;
    }

    public double getGPA(){
        return gpa;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName() + "/" + student.getGPA());

        student.setName("Felix");
        student.setGPA(3.7);

        System.out.println(student.getName() + "/" + student.getGPA());
    }

}
