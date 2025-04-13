public class Print0sand1s {

    static void sortOperation(int[] a, int n) {
        int count = 0;
        for(int  i = 0; i < n; i++){
            if(a[i] == 1){
                count++;
            }
        }

        int i = 0;

        for(int j = 0 ;j < n-count; j++){
            a[i++] = 0;
        }
        for(int j = 0 ;j < count; j++){
            a[i++] = 1;
        }
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 0, 1, 1, 1, 0, 0 };
        int n = a.length;
        System.out.print("Before sorting: ");
        for(int i =0 ;i < n; i++){
            System.out.print(a[i] + " ");
        }

        sortOperation(a, n);

        System.out.print("\nAfter sorting: ");
        for(int i =0 ;i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
