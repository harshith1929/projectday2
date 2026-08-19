// encapsulation with getter and setter method
package day_2_polymorphism;

	class Parents1 {
		private int a;

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

	}

	public class encapsulation_5 extends Parents1 {

		public static void main(String[] args) {
			encapsulation_5 test = new encapsulation_5();// object
			test.setA(11);
			int aa = test.getA();
			System.out.println(aa);
		}
	}

