public class OddOccurence {

    static int findOddCount(int[] a, int n){
        int count = 0;
        for(int  i = 0; i < n; i++){
            if(a[i] % 2 != 0 && a[i] > 1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = {5, 7, 2, 7, 5, 2, 5};
        int n = a.length;

        int res = findOddCount(a, n);
        System.out.println("The number of odd occurring number is " + res);
    }
}
