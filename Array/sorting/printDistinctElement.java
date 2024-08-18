package sorting;

import java.util.HashMap;

public class printDistinctElement {
    static void findDistinct(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.print("\nAfter eleminating distinct element: ");
        for(int i = 0; i < n; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], i);
                System.out.print(arr[i] + " ");
            }
        }
    }

    // static void findDistinctSorting(int[] arr, int n){
    //     System.out.print("\nAfter eleminating distinct element: ");
    //     for(int i = 0; i < n; i++){
    //         int min_ele = i;
    //         for(int j = i+1; j < n; j++){
    //             if(arr[min_ele] > arr[j] || arr[min_ele] != arr[j]){
    //                 min_ele = j;
    //             }
    //         }
    //         int temp = arr[min_ele];
    //         arr[min_ele] = arr[i];
    //         arr[i] = temp;
    //         System.out.print(arr[i] + " ");
    //     }
    // }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 4, 5};
        int n = arr.length;

        System.out.print("Before eleminating distinct element: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        findDistinct(arr, n);
        // findDistinctSorting(arr, n);
    }
    
}
