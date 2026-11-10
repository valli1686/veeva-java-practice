import java.util.Scanner;

public class CSVIntegerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] values = line.split(",", -1);

        int sum = 0;

        try {
            for (String value : values) {
                if (value.trim().isEmpty()) {
                    throw new NumberFormatException();
                }

                sum += Integer.parseInt(value.trim());
            }

            System.out.println(sum);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Data");
        }
    }
}