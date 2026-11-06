import java.util.Scanner;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] lastSeen = new int[256];

        for (int i = 0; i < 256; i++) {
            lastSeen[i] = -1;
        }

        int start = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (lastSeen[c] >= start) {
                start = lastSeen[c] + 1;
            }

            lastSeen[c] = i;

            maxLength = Math.max(maxLength, i - start + 1);
        }

        System.out.println(maxLength);

        sc.close();
    }
}