import java.util.Arrays;

public class arr {
    public static int[] sortAndFilter(int[] array, int key) {
        int[] array1 = Arrays.copyOf(array, array.length);
        Arrays.sort(array1);
        int count = 0;
        for (int i = 0; i < array1.length - 1; i++) {
            // if (array1[i] > array1[i + 1]) {
            // int temp = array1[i];
            // array1[i] = array1[i + 1];
            // array1[i + 1] = temp;
            // System.out.println(Arrays.toString(array1));
            if (array1[i] <= key) {
                count++;
            }
        }
        System.out.println(Arrays.toString(array1));

        int[] filteredArray = Arrays.copyOf(array1, count);
        return filteredArray;

    }
    // boolean swapped;
    // do {
    // swapped = false;
    // for (int i = 0; i < array1.length - 1; i++) {
    // if (array1[i] > array1[i + 1]) {
    // int temp = array1[i];
    // array1[i] = array1[i + 1];
    // array1[i + 1] = temp;
    // swapped = true;
    // }
    // }
    // } while (swapped);

    public static void main(String[] args) {
        int[] originalArray = { 7, 2, 10, 4, 3, 8, 6, 3 };
        int key = 5;

        int[] sortedFilteredArray = sortAndFilter(originalArray, key);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Sorted and Filtered Array (<= " + key + "): " + Arrays.toString(sortedFilteredArray));
    }
}
