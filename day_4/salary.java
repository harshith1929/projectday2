package day_4_;

public class salary {
    public static void main(String[] args) {
        int[] salaries = {10000, 15000, 18000, 12000, 20000};
        
        int total = 9;
        
        for (int salary : salaries) {
            total += salary;
        }
        
        System.out.println("Total Salary of Employees: " + total);
    }
}
