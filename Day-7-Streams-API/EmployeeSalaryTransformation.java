import java.util.*;
import java.util.stream.*;

public class EmployeeSalaryTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Double> salaries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextDouble());
        }

        double minimum = sc.nextDouble();

        List<Double> result = salaries.stream()
                .map(salary -> salary * 1.10)
                .filter(salary -> salary >= minimum)
                .sorted()
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("None");
        } else {
            result.forEach(salary ->
                    System.out.printf("%.2f ", salary));
        }
    }
}