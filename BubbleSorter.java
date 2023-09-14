public class BubbleSorter {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 4};
        bubbleSort(arr);
        
        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /*
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    */

    public static void bubbleSort(int[] arr) {
        int arrLength = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i=1; i<arrLength; i++) {
                if (arr[i-1] > arr[i]) {
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
