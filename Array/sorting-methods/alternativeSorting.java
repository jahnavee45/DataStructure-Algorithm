
public class alternativeSorting {

    static void sortingOperation(int[] arr, int n){
        for(int i = 0; i < n ; i++){
            int min_ele = i;
            for(int j = i + 1; j < n; j++){
                if(arr[min_ele] > arr[j]){
                    min_ele = j;
                }
            }
            int temp = arr[min_ele];
            arr[min_ele] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int [] arr = {3, 5, 2, 6, 7, 1, 4};
        int n = arr.length;

        System.out.print("Before sorting: ");
        for(int  i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sortingOperation(arr, n);

        System.out.print("\nAfter sorting: ");
        int i = 0, j = n-1;
        while(i < j){
                System.out.print(arr[j--] + " ");
                System.out.print(arr[i++] + " ");
        }
        if(n % 2 != 0){
            System.out.print(arr[i] + " ");
        }
        
    }
}
