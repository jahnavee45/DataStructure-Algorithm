public class InsertInSortedArray {
    static int insertOperation(int[] arr, int n, int cap, int key){
        if(n >= cap){
            return n;
        }
        int i;
        for(i = n-1; (i >= 0 && arr[i] > key); i--){
            arr[i+1] = arr[i];
        }
        arr[i+1] = key;
        return n+1;
    }
    public static void main(String[] args) {
        int[] arr = new int[20];
        int cap = 20;
        arr[0] = 1; arr[1] = 3; arr[2] = 5; arr[3] = 7; arr[4] = 9;
        int n = 5;
        int key = 4;

        System.out.print("Before insertion: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        n = insertOperation(arr, n, cap, key);
        System.out.print("\nAfter insertion: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
