package day_5;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "MADAM";
        boolean isPalindrome = true;

        for (int front = 0, back = s1.length() - 1; front < back; front++, back--) {
            if (s1.charAt(front) != s1.charAt(back)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(s1 + " is a palindrome");
        } else {
            System.out.println(s1 + " is not a palindrome");
        }
    }
}