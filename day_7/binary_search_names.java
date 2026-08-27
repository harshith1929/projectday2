package day_7;

public class binary_search_names {
    public static int binarysearch(String[] arr, String target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            System.out.println("Checking: " + arr[mid]);

            if (arr[mid].equals(target)) {
                return mid;
            } else if (target.compareTo(arr[mid]) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] names = {"Amit", "Bhavana", "Chirag", "Divya", "Harshith", "Kiran", "Manoj", "Ravi", "Zoya"};
        String target = "Ravi";

        int result = binarysearch(names, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}