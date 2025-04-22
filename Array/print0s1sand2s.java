public class print0s1sand2s {

    static void sortOperation(int[] arr, int n){
        int count1 = 0, count2 = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count1++;
            }
            if(arr[i] == 2){
                count2++;
            }
        }

        int i = 0;
        for(int j = 0; j < n-(count1+count2); j++){
            arr[i++] = 0;
        }

        for(int j = 0; j < count1; j++){
            arr[i++] = 1;
        }

        for(int j = 0; j < count2; j++){
            arr[i++] = 2;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 0, 1, 2};
        int n = arr.length;

        System.out.print("Before sorting: ");
        for(int i  = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sortOperation(arr, n);

        System.out.print("\nAfter sorting: ");
        for(int i  = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
