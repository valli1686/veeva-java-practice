import java.io.*;
import java.util.*;

public class CreateFileCheckExistence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        File file = new File(path);

        try {
            if (file.exists()) {
                System.out.println("Already Exists");
            } else if (file.createNewFile()) {
                System.out.println("Created");
            } else {
                System.out.println("Unable to Create");
            }
        } catch (IOException e) {
            System.out.println("Unable to Create");
        }
    }
}