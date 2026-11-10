import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeMap<Integer, Integer> marks = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int roll = sc.nextInt();
            int mark = sc.nextInt();

            marks.put(roll, mark);
        }

        int search = sc.nextInt();

        if (marks.containsKey(search)) {
            System.out.println(marks.get(search));
        } else {
            System.out.println("Not Found");
        }
    }
}