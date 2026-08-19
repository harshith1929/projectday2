package METHOD;

public class variables {
	int a = 66; 
    static int cc = 99;  

    void m1() {
        int a = 10;
        System.out.println("gsdfgsdkl" + a);
    }

    public variables() {
        int b = 10;
        System.out.println("sdf" + b);
    }

    public static void main(String[] args) {

        variables test = new variables(); // object

        test.m1();

        System.out.println("tyhank you" + test.a);

        System.out.println(cc);

        System.out.println(variables.cc);
    }
}