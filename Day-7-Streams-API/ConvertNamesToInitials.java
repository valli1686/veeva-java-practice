import java.util.*;
import java.util.stream.*;

public class ConvertNamesToInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine().trim();

            String result = Arrays.stream(name.split("\\s+"))
                    .filter(word -> !word.isEmpty())
                    .map(word -> word.substring(0, 1).toUpperCase() + ".")
                    .collect(Collectors.joining());

            System.out.println(result);
        }
    }
}