import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine().toLowerCase();

        line = line.replaceAll("^[^a-z0-9]+|[^a-z0-9]+$", "");
        String[] words = line.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("^[^a-z0-9]+|[^a-z0-9]+$", "");

            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        TreeMap<String, Integer> sorted = new TreeMap<>(map);

        for (String word : sorted.keySet()) {
            System.out.println(word + "=" + sorted.get(word));
        }
    }
}