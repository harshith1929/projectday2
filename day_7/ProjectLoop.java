package day_7;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectLoop {

    static class Employee {
        String name;
        int age;
        String designation;
        double salary;

        Employee(String name, int age, String designation, double salary) {
            this.name = name;
            this.age = age;
            this.designation = designation;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n==== Menu ====");
            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Sal");
            System.out.println("4) Exit");

            int choice;

            while (true) {
                System.out.print("Enter choice: ");
                String choiceInput = sc.nextLine().trim();

                try {
                    choice = Integer.parseInt(choiceInput);

                    if (choice >= 1 && choice <= 4) {
                        break;
                    } else {
                        System.out.println("Invalid choice. Please enter 1-4.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid choice. Please enter a number from 1-4.");
                }
            }

            switch (choice) {
                case 1:
                    String name;

                    while (true) {
                        System.out.print("Enter name: ");
                        String inputName = sc.nextLine().trim();

                        if (inputName.matches("[A-Za-z]+")
                                || inputName.matches("[A-Za-z]+ [A-Za-z]+")) {
                            name = inputName;
                            break;
                        } else {
                            System.out.println(
                                    "Invalid name! Enter 1 word OR 2 words with exactly one space.");
                        }
                    }

                    int age;

                    while (true) {
                        System.out.print("Enter age: ");
                        String ageInput = sc.nextLine().trim();

                        try {
                            int inputAge = Integer.parseInt(ageInput);

                            if (inputAge >= 18 && inputAge <= 60) {
                                age = inputAge;
                                break;
                            } else {
                                System.out.println(
                                        "Invalid age! Age must be between 18 and 60.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid age! Please enter a valid number.");
                        }
                    }

                    String designation;

                    while (true) {
                        System.out.print(
                                "Enter designation (programmer/manager/trainer): ");

                        String inputDesignation = sc.nextLine().trim();
                        String lower = inputDesignation.toLowerCase();

                        if (lower.equals("programmer")
                                || lower.equals("manager")
                                || lower.equals("trainer")) {
                            designation = lower;
                            break;
                        } else {
                            System.out.println(
                                    "Invalid designation! Only programmer, manager, or trainer are allowed.");
                        }
                    }

                    double salary;

                    if (designation.equals("programmer")) {
                        salary = 20000;
                    } else if (designation.equals("manager")) {
                        salary = 25000;
                    } else {
                        salary = 15000;
                    }

                    employees.add(new Employee(name, age, designation, salary));

                    System.out.println("Employee created successfully!");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println(
                                "No employee created yet. Choose option 1 first.");
                    } else {
                        displayEmployees(employees);
                    }
                    break;

                case 3:
                    if (employees.isEmpty()) {
                        System.out.println(
                                "No employee created yet. Choose option 1 first.");
                    } else {
                        String raiseEmployeeName;
                        Employee selectedEmployee = null;

                        while (true) {
                            System.out.print("Enter employee name: ");
                            raiseEmployeeName = sc.nextLine().trim();

                            for (Employee employee : employees) {
                                if (employee.name.equalsIgnoreCase(raiseEmployeeName)) {
                                    selectedEmployee = employee;
                                    break;
                                }
                            }

                            if (selectedEmployee != null) {
                                break;
                            } else {
                                System.out.println(
                                        "Employee name not found. Please enter a correct name.");
                            }
                        }

                        double raisePercentage;

                        while (true) {
                            System.out.print("Enter raise percentage (1-10): ");
                            String percentageInput = sc.nextLine().trim();

                            try {
                                raisePercentage = Double.parseDouble(percentageInput);

                                if (raisePercentage >= 1 && raisePercentage <= 10) {
                                    break;
                                } else {
                                    System.out.println(
                                            "Invalid percentage! Enter a value between 1 and 10.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println(
                                        "Invalid percentage! Please enter a valid number.");
                            }
                        }

                        selectedEmployee.salary +=
                                selectedEmployee.salary * raisePercentage / 100;

                        System.out.println("Salary raised successfully!");
                    }
                    break;


                case 4:
                    System.out.println("Exited");
                    sc.close();
                    return;
            }

            while (true) {
                System.out.print("\nContinue? (y/n): ");
                String ans = sc.nextLine().trim().toLowerCase();

                if (ans.equals("y")) {
                    break;
                } else if (ans.equals("n")) {
                    System.out.println("Stopped.");
                    sc.close();
                    return;
                } else {
                    System.out.println("Invalid input! Please enter y or n.");
                }
            }
        }
    }

    public static void displayEmployees(ArrayList<Employee> employees) {
        System.out.println("\n--- Employee Details ---");

        int employeeNumber = 1;

        for (Employee employee : employees) {
            System.out.println("\nEmployee " + employeeNumber);
            System.out.println("Name: " + employee.name);
            System.out.println("Age: " + employee.age);
            System.out.println("Salary: " + employee.salary);
            System.out.println("Designation: " + employee.designation);

            employeeNumber++;
        }
    }
}