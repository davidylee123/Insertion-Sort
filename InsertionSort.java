import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {15,4,2,12,6};
        System.out.println("Original Array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {
        int j;
        for (int i = 1; i < arr.length; i++) {
            int toInsert = arr[i];
            for (j = i; j > 0 && toInsert < arr[j-1]; j--)
                arr[j] = arr[j-1];
            arr[j] = toInsert;
        }
    }
}

/*
Original Array: [15, 4, 2, 12, 6]
Sorted Array: [2, 4, 6, 12, 15]
 */