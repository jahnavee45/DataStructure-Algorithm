import java.util.Scanner;

public class CheckUidPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String uname = sc.nextLine();
        System.out.println("Enter password: ");
        String pass = sc.nextLine();
        
        if(uname.equals("Jane")){
            if(pass.equals("test")){
                System.out.println("Welcome!");
            }else{
                System.out.println("Incorrect password!");
            }
        }else{
            System.out.println("Username invalid");
        }

        sc.close();
    }
}
