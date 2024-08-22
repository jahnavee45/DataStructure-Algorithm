public class sortingAllExceptOne {

    static void sortOperation(int[] arr, int n, int k){

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-2; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        int temp = arr[n-1];
        arr[n-1] = arr[k];
        arr[k] = temp;

        for(int i = k+1; i < n; i++){
            for(int j = k+1; j < n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp1 = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp1;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 9, 3, 2};
        int n = arr.length;
        int k = 2;

        System.out.print("Before sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        int temp = arr[k];
        arr[k] = arr[n-1];
        arr[n-1] = temp;

        sortOperation(arr, n, k);
        System.out.print("\nAfter sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
