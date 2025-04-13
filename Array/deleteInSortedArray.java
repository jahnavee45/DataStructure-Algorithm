public class DeleteInSortedArray {
    static int findElement(int[] arr, int n, int key){
        int i;
        for(i = 0; i < n; i++){
            if(arr[i] == key)
            return i;
        }
        return-1;
    }
    static int deleteOperation(int[] arr, int n, int key){
        int pos = findElement(arr, n, key);

        if(pos == -1){
            System.out.print("\nElement not found");
            return n;
        }

        for(int i = pos; i < n-1 ; i++){
            arr[i] = arr[i+1];
        }

        return n-1;

    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int n = arr.length;
        int key = 2;

        System.out.print("Before deletion: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        n = deleteOperation(arr, n, key);
        System.out.print("\nAfter deletion: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
