public class minProduct {

    static int findMinProd(int[] arr, int n){
        int minprod = arr[0] * arr[1];

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(minprod > arr[i] * arr[j]){
                    minprod = arr[i] * arr[j];
                }
            }
        }
        return minprod;
    }
    public static void main(String[] args) {
        int[] arr = {11, 8, 5, 7, 5, 1};
        int n = arr.length;

        int res = findMinProd(arr, n);
        System.out.println("The minimum product in the array is " + res);
    }
    
}
