package METHOD;
public class Demo {       //class
	void d1() { // method (constructors)
		System.out.println("First Java Project");
	}
	
	public Demo() { //default constructor
		System.out.println("Constructor");
	}
	public abstract class abstractt {   //abstract class
	abstract void add();  //abstract( does not contain body)
	}
	public static void main(String[] args) {  
		
		Demo db=new Demo(); // object
		db.d1(); //calling method constructor
	}

}