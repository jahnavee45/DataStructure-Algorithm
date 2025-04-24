public class countInversions {

    static int findCount(int[] arr, int n){
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 5, 5, 6};
        int n = arr.length;

        int res = findCount(arr, n);
        System.out.println("The number of inversions in the given array is " + res);
    }
}
