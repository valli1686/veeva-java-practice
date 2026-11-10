import java.io.*;
import java.util.*;

public class AppendStudentRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String path = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(path, true))) {

            for (int i = 0; i < n; i++) {
                String rollNumber = sc.next();
                String name = sc.next();

                bw.write(rollNumber + "," + name);
                bw.newLine();
            }

            System.out.println("Records Appended");

        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}