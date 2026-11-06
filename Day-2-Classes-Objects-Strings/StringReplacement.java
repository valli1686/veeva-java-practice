import java.util.Scanner;

public class StringReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String word = sc.nextLine();

        String result = sentence.replace(word, word.toUpperCase());

        System.out.println(result);

        sc.close();
    }
}