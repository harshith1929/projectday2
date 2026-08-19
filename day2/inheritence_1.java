// multilevel inheritence
package day_2_polymorphism;

	class GrandParent
	{
		void bp()
		{
			System.out.println(" understain   bp");
		}
	}
	class Parent4 extends GrandParent
	{
		void cancer()
		{
			System.out.println(" understain");
		}
		
	}

	public class inheritence_1 extends Parent4{

		public static void main(String[] args) {
			inheritence_1  bb= new inheritence_1();
	 		bb.bp();
	 		bb.cancer();
		}
	}

