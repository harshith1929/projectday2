package day_4_;
import java.util.Scanner;
public class calculate {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr first numbers:");
		double num1=sc.nextDouble();
		
		System.out.println("Enter operator(+,-,*,/):");
		char operator=sc.next().charAt(0);
		
		System.out.println("Enter the second number:");
		double num2=sc.nextDouble();
		
		double result=0;
		
		switch(operator) {
		case'+':result=num1+num2;break;
		case'-':result=num1-num2;break;
		case'*':result=num1*num2;break;
		case'/':result=num1/num2;break;
		default:
			System.out.println("Invalid operator");
			return;
		}
		System.out.println("Result:"+result);
		
		
	}

}
