public class ReverseArray {

    static void reverseOperation(int[] a, int n, int[] b){
        int i = 0;
        for(int j = n-1; j >=0; j--){
            b[i++] = a[j];
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int n = a.length;
        int[] b = new int[n];

        System.out.print("Before reversing: ");
        for (int i : a) {
            System.out.print(i + " ");  
        }

        reverseOperation(a, n, b);

        System.out.print("\nAfter reversing: ");
        for (int i : b) {
            System.out.print(i + " ");  
        }
    }
}
