public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int k = 10;
        int missing = findMissingNumber(arr, arr.length, k);
        System.out.println("Missing number is " + missing);
    }

    public static int findMissingNumber(int[] a, int n, int k){
        while(n != 0){
            if(a[n-1] != k){
                break;
            }
            n--;
            k--;
        }
        return k;
    }
}
