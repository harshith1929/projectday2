package day_7;
//using recursion withdraw 2k each time till the account which contains 10k gets zero


public class withdraw_recursion {

	

	static void withdraw(int balance) {

if (balance == 0) {

	System.out.println("Balance is zero");

return;

}


System.out.println("Withdrawing ₹2000");


withdraw(balance - 2000);

}

public static void main(String[] args) {

withdraw(10000);

}


}
// recursion means
