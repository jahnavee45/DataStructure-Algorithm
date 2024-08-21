public class print0sand1s {

    static int sortOperation(int[] a, int n) {
        int count = 0;
        for(int  i = 0; i < n; i++){
            if(a[i] == 1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 0, 1, 1, 1, 0, 1, 0 };
        int n = a.length;
        System.out.print("Before sorting: ");
        for(int i =0 ;i < n; i++){
            System.out.print(a[i] + " ");
        }

        int m = sortOperation(a, n);

        System.out.print("\nAfter sorting: ");
        for(int i =0 ;i < n-m; i++){
            System.out.print(0 + " ");
        }
        for(int i =0 ;i < m; i++){
            System.out.print(1 + " ");
        }
    }
}
