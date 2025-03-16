package BankOperations;
import java.util.Scanner;

public class cashWithdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String answer = "yes";
        while(answer.equals("yes")){
            System.out.println("Enter an amount: ");
            int amount = sc.nextInt();
            System.out.println("Cash withdraw successful!" + amount);
            System.out.println("Do you want to continue? yes/no");
            answer = sc.next();
        }
        System.out.println("Vist again!");
        sc.close();
    }
}
