import java.util.Scanner;

public class Transaction {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(1234567, 25000.78);
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Select an option: \n1. Get account number \n2. Chack Balance \n3. Deposit Money \n4. Withdraw money \n5. Exit");
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
        }
                
    }

    public static void withdrawMoney(double withdraw, BankAccount bank) {
        if(bank.getBalance() > 0 && withdraw < bank.getBalance()){
            double newBalance = bank.getBalance() - withdraw;
            bank.setBalance(newBalance);
            System.out.println("Amount withdrawn: ₹" + withdraw);
        }else if(withdraw > bank.getBalance()){
            System.out.println("Insufficient balance");
        }
    }

    public static void depositMoney(double deposit, BankAccount bank){
        double newBalance = bank.getBalance() + deposit;
        bank.setBalance(newBalance);
        System.out.println("New balance: ₹" + bank.getBalance());
    }
}
