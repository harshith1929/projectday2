package day_6;

public class window_new_logic {

    public static int findMinWindowLength(int[] numbers, int target) {
        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < numbers.length; end++) {
            sum += numbers[end];

            while (sum >= target) {
                int currentLength = end - start + 1;

                minLength = Math.min(minLength, currentLength);

                sum -= numbers[start];
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int result = findMinWindowLength(numbers, target);

        System.out.println("Smallest window length = " + result);
    }
}