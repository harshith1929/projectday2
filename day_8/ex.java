package day_8;
import java.util.Scanner;
public class ex{
    String name;
    int age;
    ex(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        ex obj = new ex(name, age);
        obj.display();
        sc.close();
    }
}