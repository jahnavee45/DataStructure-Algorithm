// Rotate the given array by k steps

public class rotateArray {

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
    }
}
