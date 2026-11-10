import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class FilterEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            double salary = sc.nextDouble();

            employees.add(new Employee(name, salary));
        }

        double threshold = sc.nextDouble();

        employees.removeIf(emp -> emp.salary < threshold);

        if (employees.isEmpty()) {
            System.out.println("None");
        } else {
            employees.forEach(emp -> System.out.print(emp.name + " "));
        }
    }
}