package day_2_polymorphism;

public class encapsulation_3 {
	int a ;
	int b ;

	void m1(int c,int d ) {
	 a=c;
	 b=d;
	}
	void m2() {
	 System.out.println(a+b);
	}

	public static void main(String[] args) {
		encapsulation_3   vv = new encapsulation_3();
		vv.m1(4,3);
		vv.m2();
	}
}