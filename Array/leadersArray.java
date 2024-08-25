public class leadersArray {

    static int findLeaders(int[] a, int n){
        int i = 0;
        for(int j = 0; j < n-1; j++){
            if(a[j] < a[j+1]){
                a[i++] = a[j+1];
            }
        }
        a[i++] = a[n-1];
        return i;
    }
    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        int n = a.length;

        int j = findLeaders(a, n);

        System.out.print("\nLeaders are: ");
        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");  
        }
    }
}
