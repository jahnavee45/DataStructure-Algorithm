import java.util.*;

public class InsertElement {

    public static void insertOperation(int[] arr, int n, int ele, int idx){
        int[] arr1 = new int[n+1];
        int j = 0;

        for(int i = 0; i < n+1; i++){
            if(i == idx){
                arr1[i] = ele;
            }
            else{
                arr1[i] = arr[j++];
            }
        }
        System.out.println("Array after insertion: ");
        for(int i = 0; i < n+1; i++){
            System.out.println(arr1[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element it's index to be inserted in: ");
        int ele = sc.nextInt();
        int idx = sc.nextInt();

        insertOperation(arr, arr.length, ele, idx);
        sc.close();
    }
}
