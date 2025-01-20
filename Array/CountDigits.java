public class CountDigits {
    public static void main(String[] args) {
        int n = 234567123, count = 0;
        int res = findCount(n, count);
        System.out.println("Number of digits in " + n + " is " + res);
    }

    public static int findCount(int n, int count){
        if(n == 0){
            return count;
        }
        n /= 10;
        count++;
        return findCount(n, count);
    }
}
