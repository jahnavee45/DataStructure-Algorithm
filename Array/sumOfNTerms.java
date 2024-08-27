public class sumOfNTerms {

    static int findMissingTerm(int[] a, int n){
        int sum = 0, arrSum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }

        for(int i = 0; i < n-1; i++){
            arrSum += a[i];
        }

        return sum-arrSum;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 7, 8};
        int n = 8;

        System.out.println("The missing term of given array is " + findMissingTerm(a, n));
    }
}
