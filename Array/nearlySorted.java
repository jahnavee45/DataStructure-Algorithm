public class nearlySorted {
    static void sortOperation(int[] arr, int n){
        int k;
        for(int i = 0; i < n; i++){
            k = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > k){
                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1] = k;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int n = arr.length;

        System.out.print("Before sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sortOperation(arr, n);

        System.out.print("\nAfter sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
