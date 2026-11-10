import java.io.*;
import java.util.*;

public class FilterFileLinesByKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputPath = sc.nextLine();
        String outputPath = sc.nextLine();
        String keyword = sc.nextLine().toLowerCase();

        try (BufferedReader br = new BufferedReader(
                    new FileReader(inputPath));
             BufferedWriter bw = new BufferedWriter(
                    new FileWriter(outputPath))) {

            String line;

            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(keyword)) {
                    bw.write(line);
                    bw.newLine();
                }
            }

            System.out.println("Filter Completed");

        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}