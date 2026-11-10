import java.io.*;
import java.util.*;
import java.util.regex.*;

public class SearchWordInFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String path = sc.nextLine();
        String searchWord = sc.nextLine();

        int count = 0;

        Pattern pattern = Pattern.compile(
                "\\b" + Pattern.quote(searchWord) + "\\b",
                Pattern.CASE_INSENSITIVE
        );

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {
                    count++;
                }
            }

            System.out.println(count);

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }
}