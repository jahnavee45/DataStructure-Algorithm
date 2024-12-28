import java.util.Scanner;

public class findSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the square root of: ");
        int num = sc.nextInt();
        System.out.println("The square root of " + num + " is " + findRoot(num));
        sc.close();
    }

    private static int findRoot(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        int start = 1, end = num, mid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return mid;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return Math.round(end);
    }
}
