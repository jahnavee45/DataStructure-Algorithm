package MapAndSet;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 3, 1};

        System.out.print("Given array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        int targetSum = 9;
        findIndex(arr, targetSum);

        System.out.print("Index of elements with sum " + targetSum + " is:" );
    }

    public static int[] findIndex(int[] arr, int target){
         HashMap<Integer, Integer> map = new HashMap<>();

         int[] arr1 = new int[2];
         for(int i = 0; i < arr.length; i++){
            if(map.containsKey(target - arr[i])){
                arr1[0] = i;
                arr1[1] = map.get(target - arr[i]);
            }
            map.put(arr[i], i);
         }

         return arr1;
    }
}
