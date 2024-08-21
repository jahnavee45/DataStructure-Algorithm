public class mergeSort {

    static void sortOperation(int[] a1, int n, int[] a2, int m, int[] a3){
        int i = n-1;
        int j = m-1;
        int k = m+n-1;
        while(j >= 0){
            if(i >= 0 && a1[i] > a2[j]){
                a3[k--] = a1[i--];
            }else{
                a3[k--] = a2[j--];
            }
        }
        if(i >= 0){
            a3[k--] = a1[i--];
        }
        if(j >= 0){
            a3[k--] = a2[j--];
        }
        
    }
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {2, 3, 5, 6, 7};
        int n = a1.length;
        int m = a2.length;
        int[] a3 = new int[n+m];
        sortOperation(a1, n, a2, m, a3);
        System.out.print("\nAfter sorting: ");
        for (int i = 0; i < a3.length-1; i++) {
            System.out.print(a3[i] + " ");
        }
    }
}
