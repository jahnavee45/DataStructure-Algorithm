public class Fibonnaci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 10;
        int res = findNthFibonacci(a, b, n);
        System.out.println("10th element of fibonacci series: " + res);
    }

    public static int findNthFibonacci(int a, int b, int n){
        if (n == 0){
            return a;
        }
        
        return findNthFibonacci(b, a+b, n-1);
    }
}
