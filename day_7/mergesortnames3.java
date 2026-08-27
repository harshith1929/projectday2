package day_7;

public class mergesortnames3 {

    static void mergeSort(String[] a, int left, int right) {
        if (left >= right)
            return;

        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);

        String[] temp = new String[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // Compare strings alphabetically using compareTo
        while (i <= mid && j <= right) {
            temp[k++] = a[i].compareTo(a[j]) < 0 ? a[i++] : a[j++];
        }

        while (i <= mid)
            temp[k++] = a[i++];
        while (j <= right)
            temp[k++] = a[j++];

        for (i = 0; i < temp.length; i++)
            a[left + i] = temp[i];
    }

    public static void main(String[] args) {
        String[] names = {"Ravi", "Anita", "Kiran", "Suresh", "Meena", "Ajay", "Divya", "Rahul"};
        mergeSort(names, 0, names.length - 1);

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name + " ");
        }
    }
}



