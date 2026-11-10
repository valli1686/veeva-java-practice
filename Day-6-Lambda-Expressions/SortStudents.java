import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class SortStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int marks = sc.nextInt();

            students.add(new Student(name, marks));
        }

        students.sort((a, b) -> {
            if (a.marks != b.marks) {
                return b.marks - a.marks;
            }

            return a.name.compareTo(b.name);
        });

        students.forEach(s ->
            System.out.println(s.name + " " + s.marks)
        );
    }
}