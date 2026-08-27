package day_6;

public class new_logic_expenses {
    public static void main(String[] args) {

        int[] marks = {75, 82, 68, 90, 88};
        int[] prefix = new int[marks.length];

        prefix[0] = marks[0];

        for (int i = 1; i < marks.length; i++) {
            prefix[i] = prefix[i - 1] + marks[i];
        }

        int total = prefix[3] - prefix[0];

        System.out.println("Total Marks = " + total);
    }
}


