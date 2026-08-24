package day_4_;

public class studentModulo {
    public static void main(String[] args) {
        int student = 23;
        int studentPerRow = 5;

        int leftover = student % studentPerRow;

        System.out.println("Number of students left: " + leftover);
    }
}
