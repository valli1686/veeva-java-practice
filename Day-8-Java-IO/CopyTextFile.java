import java.io.*;
import java.util.*;

public class CopyTextFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String source = sc.nextLine();
        String destination = sc.nextLine();

        File sourceFile = new File(source);

        if (!sourceFile.exists()) {
            System.out.println("Source File Not Found");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(source));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destination))) {

            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Copy Completed");

        } catch (IOException e) {
            System.out.println("Source File Not Found");
        }
    }
}