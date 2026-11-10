import java.util.*;
import java.util.stream.*;

public class LongestWordUsingStreams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String result = Arrays.stream(sentence.split("\\s+"))
                .map(word -> word.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", ""))
                .filter(word -> !word.isEmpty())
                .sorted(Comparator.comparingInt(String::length)
                        .reversed()
                        .thenComparing(String::compareTo))
                .findFirst()
                .orElse("None");

        System.out.println(result);
    }
}