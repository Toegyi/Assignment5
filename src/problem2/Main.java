package problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("John Doe", LocalDate.of(2015, 1, 1), 50000.0, 10);
        Professor p2 = new Professor("Jane Doe", LocalDate.of(2017, 1, 1), 60000.0, 20);
        Professor p3 = new Professor("Bob Smith", LocalDate.of(2019, 1, 1), 70000.0, 30);
        Secretary s1 = new Secretary("Alice Johnson", LocalDate.of(2016, 1, 1), 35000.0, 5);
        Secretary s2 = new Secretary("Eve Wilson", LocalDate.of(2018, 1, 1), 40000.0, 10);

        DeptEmployee[] department = {p1, p2, p3, s1, s2};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to see the sum of all salaries (Y/N)? ");
        String response = scanner.nextLine().trim();

        if (response.equalsIgnoreCase("Y")) {
            double totalSalary = 0.0;
            for (DeptEmployee employee : department) {
                totalSalary += employee.computeSalary();
            }
            System.out.println("Total salary in the department: " + totalSalary);
        }
    }
}

