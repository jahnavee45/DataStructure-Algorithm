package sorting;

public class checkIfSorted {
    static int checkSorted(int[] arr, int n){
        if(n == 1){
            return 1;
        }
        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                return 0;
            }
        }
        
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3 };
        int n = arr.length;
        int res = checkSorted(arr, n);
        if(res == 0) {
            System.out.println("Unsorted array");
        }
        else{
            System.out.println("Sorted array");
        }
    }
    
}
