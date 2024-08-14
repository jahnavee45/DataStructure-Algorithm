public class insertAnywhere {
    static void insertElements(int[] arr, int n, int pos, int key){
        for(int i = n-1 ; i >= pos; i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = key;
    }
    public static void main(String[] args) {
        int arr[] = new int[20];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = 3;
        arr[4] = 7;
        arr[5] = 1;
        int n = 6;
        int pos = 2;
        int key = 50;

        System.out.print("Before insertion: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        insertElements(arr, n, pos, key);
        n += 1;
        System.out.print("\nAfter insertion: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
