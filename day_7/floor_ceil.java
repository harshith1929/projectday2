package day_7;
// floor and ceil with names
public class floor_ceil {

    public static void main(String[] args) {
        String[] names = {"Amit", "Bhavana", "Chirag", "Divya", "Harshith", "Kiran", "Manoj", "Ravi", "Zoya"};
        String target = "Hema";   // name we want to search around

        int start = 0;
        int end = names.length - 1;
        String floor = null;
        String ceil = null;

        while (start <= end) {
            int mid = (start + end) / 2;
            System.out.println("Checking: " + names[mid]);

            if (names[mid].equals(target)) {
                floor = names[mid];
                ceil = names[mid];
                break;
            } else if (names[mid].compareTo(target) < 0) {
                floor = names[mid];    // possible floor (alphabetically before target)
                start = mid + 1;       // go RIGHT
            } else {
                ceil = names[mid];     // possible ceil (alphabetically after target)
                end = mid - 1;         // go LEFT
            }
        }

        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }
}
