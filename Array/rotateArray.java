// Rotate the given array by k steps

public class rotateArray {

    static void reverse(int[] a, int i, int j){

        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int[] a, int k){

        k %= a.length;

        reverse(a, 0, a.length-1);
        reverse(a, 0, k-1);
        reverse(a, k, a.length-1);
    }

    static void printArray(int[] a){
        for(int i : a){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.print("Before rotating: ");
        printArray(a);

        System.out.print("\nAfter rotating: ");
        rotate(a, k);
        printArray(a);
    }
}
