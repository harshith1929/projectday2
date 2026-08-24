package day_4_;
import java.util.Scanner;
public class factorial { 
    
    static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = factorial(num);
            System.out.println("Factorial of " + num + " is: " + fact);
        }
        
        input.close();
    }
}



