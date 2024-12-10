package MapAndSet;

import java.util.HashMap;

public class countTargetSumSubArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 13, 11, 6, 6, 3, 3};
        int target = 56;
        
        System.out.println("The number of distinct pairs of target sum " + target + " is " + findCount(arr, target));
    }

    public static int findCount(int[] arr, int target){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(target - arr[i])){
                map.put(arr[i], i);
            }else{
                count++;
            }
        }
        return count;
    }
}
