package day_7;
//using for loop;
public class Recursion_with_the_help_of_iteration {

	    public static void main(String[] args) {

	        int balance = 10000;

	        for (int i = balance; i > 0; i -= 2000) {
	            System.out.println("Withdrawing ₹2000");
	            System.out.println("Remaining balance: ₹" + (i - 2000));
	        }
	    }
	}