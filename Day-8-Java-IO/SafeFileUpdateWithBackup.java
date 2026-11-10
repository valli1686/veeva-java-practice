import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SafeFileUpdateWithBackup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String path = sc.nextLine();
        String replacement = sc.nextLine();

        Path source = Paths.get(path);

        if (!Files.exists(source)) {
            System.out.println("File Not Found");
            return;
        }

        Path backup = source.resolveSibling(
                source.getFileName().toString() + ".bak");

        try {
            Files.copy(source, backup,
                    StandardCopyOption.REPLACE_EXISTING);

            Files.writeString(source, replacement);

            System.out.println("Updated with Backup");

        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}