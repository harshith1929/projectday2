package METHOD;

public class palindrome {
    public static void main(String[] args) {
        int n=121, t=n, rev=0;
        while(n>0) {
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.println(t==rev ? "Palindrome" : "Not Palindrome");
    }
}

