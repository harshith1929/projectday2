package day_5;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        int[] freq = new int[256]; // ASCII size

        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        int duplicateCount = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                duplicateCount++;
                System.out.println((char) i + " appears " + freq[i] + " times");
            }
        }

        System.out.println("Total number of duplicates: " + duplicateCount);
    }
}
