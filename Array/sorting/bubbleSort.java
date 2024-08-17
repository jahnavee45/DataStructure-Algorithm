package sorting;

public class bubbleSort {

    static void sortOperation(int[] arr, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 7, 1, 8, 6 };
        int n = arr.length;

        System.out.print("Before sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sortOperation(arr, n);
        System.out.print("\nAfter sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
