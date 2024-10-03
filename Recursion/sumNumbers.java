import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("The sum of first " + n + " natural numbers is " + findSum(n, 0));

        sc.close();
    }

    private static int findSum(int n, int sum) {

        if(n == 0){
            return sum; 
        }

        return findSum(n - 1, sum + n);
    }
}
