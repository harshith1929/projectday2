package day_7;

public class withdrawal_using_while_loop {

		    public static void main(String[] args) {

		        int balance = 10000;

		        while (balance > 0){
		            System.out.println("Withdrawing ₹2000");
		            balance= balance-2000;
		            
		            System.out.println("Remaining balance: ₹" + (balance ));
		        }
		    }
		}


