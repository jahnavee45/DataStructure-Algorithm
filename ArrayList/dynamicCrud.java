import java.util.ArrayList;
import java.util.Scanner;

public class dynamicCrud {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want in list: ");
        int n = sc.nextInt();
        System.out.printf("Now enter %d elements to add in list: ", n);

        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }

        // printing the list
        System.out.println("The elements of arraylist are: " + a);

        // updating element
        System.out.println("Enter the index of element you want to update and a new value: ");
        int up = sc.nextInt();
        int val = sc.nextInt();
        a.set(up, val);
        System.out.println("Updated arraylist is: " + a);

        // removing element
        System.out.println("Enter the index of element you want to delete: ");
        int del = sc.nextInt();
        a.remove(del);

        System.out.println("Updated arraylist is: " + a);

        sc.close();
    }
}
