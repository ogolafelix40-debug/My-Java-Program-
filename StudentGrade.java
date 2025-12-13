import java.util.Scanner;
class Student{
    String name;
    double marks;

    //constructor
    Student(String name, double marks){
        this.name = name;
        this.marks = marks;
    }
    void displayDetails(){
        System.out.println("Student name:" + name);
        System.out.println("marks:" + marks);
    }
}

class GradeCalculator{

    String calculateGrade(double marks){

    if (marks >= 90){
        return "A";
    }
    else if (marks >= 75 && marks < 90){
        return "B";
    }
    else if (marks >= 50 && marks < 75){
        return "C";
    }
    else{
        return "D";
    }
}
}

public class StudentGrade{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter marks:");
        double marks = scanner.nextDouble();

        Student student = new Student(name, marks);

        GradeCalculator gc = new GradeCalculator();
        String grade = gc.calculateGrade(marks);

        //Diplay results
        student.displayDetails();
        System.out.println("Grade:" + grade);
    }
}
