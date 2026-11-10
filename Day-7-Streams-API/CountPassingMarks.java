import java.util.*;
import java.util.stream.*;

public class CountPassingMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> marks = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }

        int threshold = sc.nextInt();

        long count = marks.stream()
                .filter(mark -> mark >= threshold)
                .count();

        System.out.println(count);
    }
}