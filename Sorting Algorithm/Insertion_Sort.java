public class Insertion_Sort {

    // Approach :-
    // Select an element in each iteration from the unsorted array(using a loop).
    // Place it in its corresponding position in the sorted part and shift the
    // remaining elements accordingly (using an inner loop and swapping). The “inner
    // while loop” basically shifts the elements using swapping.

    static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
