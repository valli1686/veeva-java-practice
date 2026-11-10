import java.util.*;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            words.add(sc.next());
        }

        words.sort((a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }

            return a.compareTo(b);
        });

        words.forEach(word -> System.out.print(word + " "));
    }
}