package day_6;

public class ArrayMergedOpr {
    public static void main(String[] args) {

        String[] array1 = {"Kishore", "Yash", "Michael", "Anand"};
        String[] array2 = {"Sophia", "Anand", "Olivia", "Yash"};

        String[] joined = new String[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            joined[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            joined[array1.length + i] = array2[i];
        }

        System.out.println("JOIN:");
        for (int i = 0; i < joined.length; i++) {
            System.out.println(joined[i]);
        }

        String[] union = new String[array1.length + array2.length];
        int unionCount = 0;

        for (int i = 0; i < array1.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < unionCount; j++) {
                if (union[j].equals(array1[i])) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                union[unionCount] = array1[i];
                unionCount++;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < unionCount; j++) {
                if (union[j].equals(array2[i])) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                union[unionCount] = array2[i];
                unionCount++;
            }
        }

        System.out.println("\nUNION:");
        for (int i = 0; i < unionCount; i++) {
            System.out.println(union[i]);
        }

        String[] intersection = new String[array1.length];
        int intersectionCount = 0;

        for (int i = 0; i < array1.length; i++) {
            boolean found = false;

            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    found = true;
                    break;
                }
            }

            boolean alreadyAdded = false;

            for (int j = 0; j < intersectionCount; j++) {
                if (intersection[j].equals(array1[i])) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (found && !alreadyAdded) {
                intersection[intersectionCount] = array1[i];
                intersectionCount++;
            }
        }

        System.out.println("\nINTERSECTION:");
        for (int i = 0; i < intersectionCount; i++) {
            System.out.println(intersection[i]);
        }
    }
}