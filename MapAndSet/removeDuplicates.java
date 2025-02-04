package MapAndSet;

import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 3, 5};
        System.out.println("Before removing duplicate: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        int n = removeDuplicateOp(a, a.length);
        System.out.println("After removing duplicate: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    
    public static int removeDuplicateOp(int[] a, int n){
        HashSet<Integer> hashSet = new HashSet<>();
        int j = 0;
        for(int a1 : a){
            hashSet.add(a1);
        }
        for(int i : hashSet){
            a[j++] = i;
        }

        return j;
    }
}
