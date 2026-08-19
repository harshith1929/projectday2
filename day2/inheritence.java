package day_2_polymorphism;

	class Parent
	{
		void cancer()
		{
			System.out.println(" understain");
		}
		void bp()
		{
			System.out.println(" understain   bp");
		}
	}

	public class inheritence extends Parent{

		public static void main(String[] args) {
			inheritence bb= new inheritence();
	 		bb.bp();
	 		bb.cancer();
		}
	}

	

