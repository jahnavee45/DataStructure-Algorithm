package MapAndSet;

import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int [] arr = {3, 2, 3};
        int res = findMajority(arr);
        System.out.println("The mejority element is " + res);
    }

    public static int findMajority(int[] arr){
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for(int i : arr){
            if(map.get(i) > arr.length/2){
                res = i;
            }
        }
        return res;
    }
}
