package day_6;

public class AssendingOrderRearrangement {
	public static void main(String[] args) {

        int[] numbers = {3, 1, 2, 4};

        for (int i = 0; i < numbers.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[smallestIndex];
            numbers[smallestIndex] = temp;
        }
        System.out.println("Ascending order:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
