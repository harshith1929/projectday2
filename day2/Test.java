package day_2_polymorphism;
public class Test {
	int a = 20;

	void m1(int b) {
		System.out.println("dfasdf "+b);
		System.out.println("dfasdf "+a);
	}

	public static void main(String[] args) {
		Test   vv = new Test();
		vv.m1(4);
	}
}