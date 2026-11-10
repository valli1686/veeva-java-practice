import java.util.Scanner;
import java.util.function.Function;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Function<String, String> trim = s -> s.trim();

        Function<String, String> uppercase =
            s -> s.toUpperCase();

        Function<String, String> replaceSpaces =
            s -> s.replaceAll("\\s+", "-");

        Function<String, String> operation =
            trim.andThen(uppercase).andThen(replaceSpaces);

        System.out.println(operation.apply(input));
    }
}