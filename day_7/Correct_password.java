package day_7;

public class Correct_password {
	static String correctpassword ="231";
	static void trypassword(String password) {
		System.out.println("Trying:"+password);
		
		if(password.equals(correctpassword)) {
			System.out.println("Password found: " + password);
			return;
		}
		System.out.println("wrong password.go back and try another.");
	}
	public static void main(String[] args) {
		trypassword("123");
		trypassword("132");
		trypassword("213");
		trypassword("546");

	}

}
