package day_2_polymorphism;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int num = n;
	        int sum = 0;

	        int digits = String.valueOf(Math.abs(num)).length();

	        while (num != 0) {
	            int rem = num % 10;
	            sum += Math.pow(rem, digits);
	            num /= 10;
	        }

	        if (sum == n) {
	            System.out.println(n + " is an Armstrong number.");
	        } else {
	            System.out.println(n + " is NOT an Armstrong number.");
	        }

	        sc.close();
	    }
	}