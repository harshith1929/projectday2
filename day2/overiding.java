package day_2_polymorphism;

// poly morphism
//method overloading
// method overriding


class Parents
{
   void property()
   {
	   System.out.println("Property");
   }
   void marry()
   {
	   System.out.println("famaily selected girl/boy");
   }
}
public class overiding extends Parents {
	void marry()
	{
		System.out.println("campus selected girl/boy");
	}
	public static void main(String[] args) {
		overiding test = new overiding();// object
		test.marry();
		test.property();
	
	}
}