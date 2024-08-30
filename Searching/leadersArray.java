public class leadersArray {

    static void findLeaders(int[] a, int n){
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (a[i] <= a[j])
                    break;
            }
            if (j == n) // the loop didn't break
                System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 2};
        int n = a.length;

        System.out.print("\nLeaders are: ");
        findLeaders(a, n);
    }
}
