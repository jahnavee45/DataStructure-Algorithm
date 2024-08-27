public class maxSumSubarray {

    static int findSum(int[] a, int n){
        int max_ending = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            max_ending += a[i];
            
            maxSum = Math.max(maxSum, max_ending);

            max_ending = Math.max(max_ending, 0);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] a = {-2,-3,4,-1,-2,1,5,-3};
        int n = a.length;

        System.out.println("The largest contiguous sum of subarray is " + findSum(a, n));
    }
}
