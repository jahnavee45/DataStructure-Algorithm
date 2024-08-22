public class sortAbsoluteDifference {

    static void sortOperation(int[] arr, int n, int x){
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++){
            arr2[i] = Math.abs(x - arr[i]);
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1; j++){
                if(arr2[j] > arr2[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 9, 3};
        int n = arr.length;
        int diff = 7;

        System.out.print("Before sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sortOperation(arr, n, diff);
        System.out.print("\nAfter sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
