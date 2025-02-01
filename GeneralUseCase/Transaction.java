import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(1234567, 25000.78);
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Select an option: \n1. Get account number \n2. Chack Balance \n3. Deposit Money \n4. Withdraw money");
        int option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1:{
                System.out.println("Account number is: " + bank.getAccountNumber());
            }
            case 2:{
                System.out.println("Current balance is: ₹" + bank.getBalance());
            }
            case 3:{
                System.out.println("Enter the amount to deposit: ");
                double deposit = sc.nextDouble();
                sc.nextLine();
                depositMoney(deposit, bank);
            }
            case 4:{
                System.out.println("Enter the amount to withdraw: ");
                double withdraw = sc.nextDouble();
                sc.nextLine();
                withdrawMoney(withdraw, bank);
            }

            default:
                break;
        }

        

    }
}
