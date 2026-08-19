package day_3;
import java.util.Scanner;
public class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        int age = 0;
        String designation = "";
        double salary = 0;
        
        while (true) {
            System.out.println("\n==== Menu ====");
            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Sal");
            System.out.println("4) Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
            case 1:
                while (true) {
                    System.out.print("Enter name: ");
                    String inputName = sc.nextLine().trim();

                    if (inputName.matches("[A-Za-z]+") || inputName.matches("[A-Za-z]+ [A-Za-z]+")) {
                        name = inputName;
                        break;
                    } else {
                        System.out.println("Invalid name! Enter 1 word OR 2 words with exactly one space.");
                    }
                }

                while (true) {
                    System.out.print("Enter age: ");
                    int inputAge = sc.nextInt();
                    sc.nextLine(); // consume newline

                    if (inputAge >= 18 && inputAge <= 60) {
                        age = inputAge;
                        break;
                    } else {
                        System.out.println("Invalid age! Age must be between 18 and 60.");
                    }
                }

                while (true) {
                    System.out.print("Enter designation (programmer/manager/trainer): ");
                    String inputDesignation = sc.nextLine().trim();

                    String lower = inputDesignation.toLowerCase();
                    if (lower.equals("programmer") || lower.equals("manager") || lower.equals("trainer")) {
                        designation = lower; // store normalized value
                        break;
                    } else {
                        System.out.println("Invalid designation! Only programmer, manager, or trainer are allowed.");
                    }
                }

                if (designation.equals("programmer")) {
                    salary = 20000;
                } else if (designation.equals("manager")) {
                    salary = 25000;
                } else if (designation.equals("trainer")) {
                    salary = 15000;
                }

                System.out.println("Employee created successfully!");
                break;


                case 2:
                    if (name.isEmpty()) {
                        System.out.println("No employee created yet. Choose option 1 first.");
                    } else {
                        System.out.println("\n--- Employee Details ---");
                        System.out.println("Name: " + name);
                        System.out.println("Age: " + age);
                        System.out.println("Salary: " + salary);
                        System.out.println("Designation: " + designation);

                        }
                    break;

                case 3:
                    if (name.isEmpty()) {
                        System.out.println("No employee created yet. Choose option 1 first.");
                    } else {
                        System.out.print("Enter raise amount (e.g., 5000): ");
                        double raise = sc.nextDouble();
                        sc.nextLine(); // consume newline
                        salary += raise;
                        System.out.println("Salary raised successfully! New salary = " + salary);
                    }
                    break;

                case 4:
                    System.out.println("Exited");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }

            
            
            System.out.print("\nContinue? (y/n): ");
            String ans = sc.nextLine().trim().toLowerCase();

            if (ans.equals("n")) {
                System.out.println("Stopped.");
                break;
            } else if (!ans.equals("y")) {
                System.out.println("Invalid input. Stopping.");
                break;
            }
        }

        sc.close();
    }
}