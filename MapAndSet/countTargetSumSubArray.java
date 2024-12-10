package MapAndSet;

public class countTargetSumSubArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 13, 11, 6, 6, 3, 3};
        int target = 12;
        
        System.out.println("The number of distinct pairs of target sum " + target + " is " + findCount(arr, target));
    }
}
