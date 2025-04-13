import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial of: ");
        int n = sc.nextInt();

        System.out.println("The factorial of " + n + " is " + fact(n));
        sc.close();
    }

    private static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }
}
