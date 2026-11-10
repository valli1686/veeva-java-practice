import java.io.*;
import java.nio.file.*;
import java.util.*;

public class MergeTextFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String file1 = sc.nextLine();
        String file2 = sc.nextLine();
        String destination = sc.nextLine();

        if (!Files.exists(Paths.get(file1)) ||
            !Files.exists(Paths.get(file2))) {

            System.out.println("Source File Not Found");
            return;
        }

        try {
            String content1 = Files.readString(Paths.get(file1));
            String content2 = Files.readString(Paths.get(file2));

            StringBuilder merged = new StringBuilder(content1);

            if (!content1.isEmpty() &&
                !content1.endsWith("\n") &&
                !content1.endsWith("\r")) {
                merged.append(System.lineSeparator());
            }

            merged.append(content2);

            Files.writeString(Paths.get(destination), merged.toString());

            System.out.println("Merge Completed");

        } catch (IOException e) {
            System.out.println("Source File Not Found");
        }
    }
}