package MapAndSet;

import java.util.HashSet;

public class evenOdd {
    public static void main(String[] args) {
       int[] arr = {3, 42, 72, 11, 59, 60};
       
       HashSet<Integer> even = new HashSet<>();
       HashSet<Integer> odd = new HashSet<>();
       for(int i = 0; i < arr.length; i++) {
        if(arr[i] % 2 == 0){
            even.add(arr[i]);
        }else{
            odd.add(arr[i]);
        }
       }

       System.out.println("Even numbers: " + even);
       System.out.println("Odd numbers: " + odd);
    }
}
