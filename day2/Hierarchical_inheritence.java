package day_2_polymorphism;

	class GrandParent1
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Parent5 extends GrandParent1
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}

public class Hierarchical_inheritence extends GrandParent1{

	public static void main(String[] args) {
		Hierarchical_inheritence  bb= new Hierarchical_inheritence();
 		bb.bp();	}
}


