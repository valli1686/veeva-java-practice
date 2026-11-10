import java.util.*;
import java.util.stream.*;

public class AverageOfValidMeasurements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Double> measurements = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            measurements.add(sc.nextDouble());
        }

        OptionalDouble average = measurements.stream()
                .filter(value -> value >= 0 && value <= 100)
                .mapToDouble(Double::doubleValue)
                .average();

        if (average.isPresent()) {
            System.out.printf("%.2f%n", average.getAsDouble());
        } else {
            System.out.println("No Valid Data");
        }
    }
}