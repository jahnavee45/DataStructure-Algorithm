public class waveArray {

    static void sortOperation(int[] arr, int n){
        for(int i = 0; i < n; i++){
            int min_ele = i;
            for(int j = i+1; j < n; j++){
                if(arr[min_ele] > arr[j]){
                    min_ele = j;
                }
            }
            int temp = arr[min_ele];
            arr[min_ele] = arr[i];
            arr[i] = temp;
        }

        for(int i = 0; i < n-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 7, 1, 8, 6, 4 };
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
