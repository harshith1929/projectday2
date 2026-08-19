package day_2_polymorphism;

public class encapsulation {
	int a = 20;
	int b = 10;

	void m1(int c,int d) {
		System.out.println("dfasdf "+(a+b));
	System.out.println("asdfas"+(c+d));
	}

	public static void main(String[] args) {
		encapsulation   vv = new encapsulation();
		vv.m1(4,3);
	}

	public void m2() {		
	}

	public void setA(int i) {		
	}

	public int getA() {
		return 0;
	}
}