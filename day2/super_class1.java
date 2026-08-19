package day_2_polymorphism;

class parent1
{
   int a =10;
		   int b =20;
}

public class super_class1 extends parent1 {
	int a=20;
	int b =30;
	
	void add(int a , int b)
	{
		System.out.println(super.a+super.b);
		System.out.println(this.a+this.b);
		System.out.println(a+b);
	}
public static void main(String[] args) {
	super_class1 jj = new super_class1();
	jj.add(2, 3);
	
}
}