import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class SortEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        employees.sort((a, b) -> {
            if (a.salary != b.salary) {
                return Double.compare(a.salary, b.salary);
            }
            return a.name.compareTo(b.name);
        });

        for (Employee e : employees) {
            System.out.printf("%d %s %.2f%n",
                    e.id, e.name, e.salary);
        }
    }
}