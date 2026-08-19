package day_2_polymorphism;

public class method_overloading {
public method_overloading() {
System.out.println("Hello world");
} 
public method_overloading(int a) {
	System.out.println("Hello world contr");
} 
	
public static void main(String[] args) {
	method_overloading gg = new method_overloading();
method_overloading gf = new method_overloading(3);

}
}
