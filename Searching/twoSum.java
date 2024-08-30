import java.util.*;

public class twoSum{

    public static void indexOfElement(int[] arr, int target){
        int[] arr1 = new int[2];
        int k = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(target - arr[i] == arr[j] && i!=j){
                    arr1[k++] = i;
                }
            }
        }
        System.out.println("Index of element having sum " + target + " is: " + arr1[0] + " and " + arr1[1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to find two sum of: ");
        int target = sc.nextInt();

        indexOfElement(arr, target);
        sc.close();
    }
}