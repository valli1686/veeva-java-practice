import java.io.*;
import java.util.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    int rollNumber;
    String name;
    double marks;

    Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }
}

public class SerializeDeserializeStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String path = sc.next();
        int rollNumber = sc.nextInt();
        String name = sc.next();
        double marks = sc.nextDouble();

        Student student = new Student(rollNumber, name, marks);

        try {
            try (ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(path))) {
                out.writeObject(student);
            }

            try (ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(path))) {

                Student recovered = (Student) in.readObject();

                System.out.println(recovered.rollNumber + " "
                        + recovered.name + " "
                        + recovered.marks);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Serialization Error");
        }
    }
}