package day_6;


public class student_marks {

    public static void main(String[] args) {

        int[] marksDifference = {8, -3, 6, 4, -5, 7, -2, 9};

        int currentMarks = 0;
        int topperMarks = 0;

        for (int i = 0; i < marksDifference.length; i++) {
            currentMarks += marksDifference[i];

            if (currentMarks < 0) {
                currentMarks = 0;
            }

            if (currentMarks > topperMarks) {
                topperMarks = currentMarks;
            }
        }

        System.out.println("Maximum marks difference = " + topperMarks);
    }
}