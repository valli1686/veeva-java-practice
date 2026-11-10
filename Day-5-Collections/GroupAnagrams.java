import java.util.*;

public class GroupAnagrams {

    static String getKey(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            String key = getKey(word);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        ArrayList<ArrayList<String>> groups =
                new ArrayList<>(map.values());

        for (ArrayList<String> group : groups) {
            Collections.sort(group);
        }

        groups.sort((a, b) ->
                a.get(0).compareTo(b.get(0)));

        for (ArrayList<String> group : groups) {
            for (String word : group) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }
}