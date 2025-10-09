import java.util.Scanner;

class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Department: " + department + ", Salary: $" + salary);
    }

    public void increaseSalary(double amount) {
        salary += amount;
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept employee info
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Employee emp = new Employee(name, department, salary);

        // Display initial info
        System.out.println("\nEmployee Information:");
        emp.displayInfo();

        // Process command-line arguments for salary increment
        if (args.length > 0) {
            try {
                double increment = Double.parseDouble(args[0]);
                emp.increaseSalary(increment);
                System.out.println("\nAfter salary increment of $" + increment + ":");
                emp.displayInfo();
            } catch (NumberFormatException e) {
                System.out.println("Invalid increment amount provided in arguments.");
            }
        } else {
            System.out.println("\nNo salary increment argument provided.");
        }

        scanner.close();
    }
}
