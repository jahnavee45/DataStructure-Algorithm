import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner myObj= new Scanner( System.in);
        int number;
        System.out.println("Enter number");
        number=myObj.nextInt();
        if(number %2==0){
            System.out.println("number is even.");
        }else{
            System.out.println("number is odd.");
        }

        myObj.close();
    }
}
