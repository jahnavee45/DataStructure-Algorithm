public class insertAtEnd {

    public static int insertElementAtEnd(int[] arr, int n, int key, int cap){
        if(n == cap-1){
            return n;
        }
        arr[n] = key;
        return (n + 1);
    }
    public static void main(String[] args) {
        int arr[] = new int[20];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = 3;
        arr[4] = 7;
        arr[5] = 1;
        int cap = 20;
        int n = 6;
        int key = 26;

        System.out.print("Array before insertion: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

        n = insertElementAtEnd(arr, n, key, cap);
    
        System.out.print("\nArray after insertion: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
