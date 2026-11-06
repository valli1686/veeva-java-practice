import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);
            int count = 0;

            while (i < s.length() && s.charAt(i) == c) {
                count++;
                i++;
            }

            result.append(c);

            if (count > 1) {
                result.append(count);
            }
        }

        String compressed = result.toString();

        if (compressed.length() < s.length()) {
            System.out.println(compressed);
        } else {
            System.out.println(s);
        }

        sc.close();
    }
}