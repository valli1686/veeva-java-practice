import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            if (c != ' ') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for (char c : s.toCharArray()) {
            if (c != ' ' && map.get(c) == 1) {
                System.out.println(c);
                sc.close();
                return;
            }
        }

        System.out.println("None");
        sc.close();
    }
}