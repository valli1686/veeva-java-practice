import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("RollNo: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rollNo = sc.nextInt();
        String name = sc.next();
        double marks = sc.nextDouble();

        Student s = new Student(rollNo, name, marks);
        s.display();

        sc.close();
    }
}