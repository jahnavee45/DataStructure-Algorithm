package sorting;

import java.util.HashMap;

public class printDistinctElement {
    static void findDistinct(int[] arr, int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.print("\nPrinting Distinct element after eleminating: ");
        for(int i = 0; i < n; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], i);
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void findDistinctSorting(int[] arr, int n){
        System.out.print("\nPrinting Distinct element after sorting & eleminating: ");
        for(int i = 0; i < n; i++){
            int min_ele = i;
            for(int j = i+1; j < n; j++){
                if(arr[min_ele] > arr[j]){
                    min_ele = j;
                }
            }
            int temp = arr[min_ele];
            arr[min_ele] = arr[i];
            arr[i] = temp;
        }

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                System.out.print(arr[i-1] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 4, 5};
        int n = arr.length;

        System.out.print("Before eleminating distinct element: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        findDistinct(arr, n);
        findDistinctSorting(arr, n);
    }
    
}
