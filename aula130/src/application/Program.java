package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        Integer n = sc.nextInt(); sc.nextLine();

        for(int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            Character outsourced = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            Double value = sc.nextDouble();
            sc.nextLine();

            if(outsourced == 'y'){
                System.out.print("Additional charge: ");
                Double additional = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name,hours, value,additional);
                employees.add(employee);
            } else {
                Employee employee = new Employee(name, hours, value);
                employees.add(employee);
            }

        }

        System.out.println("\nPAYMENTS:");
        for (Employee e : employees){
            System.out.println(e.toString());
        }

        sc.close();

    }
}
