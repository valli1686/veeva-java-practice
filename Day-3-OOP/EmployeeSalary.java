import java.util.Scanner;

class Employee {
    private int employeeId;
    private String name;
    private double salary;

    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        double salary = sc.nextDouble();
        double newSalary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);
        emp.setSalary(newSalary);

        System.out.printf("%.2f%n", emp.getSalary());
    }
}