package MapAndSet;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class otpGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mobile number: ");
        String mobile = sc.nextLine();
        
        HashMap<String, Integer> map = new HashMap<>();
        int otp = 100000 + new Random().nextInt(900000);
        map.put(mobile, otp);
        System.out.println(map);

        System.out.println("Enter the mobile number: ");
        String num = sc.nextLine();
        System.out.println("Enter the otp: ");
        int val = sc.nextInt();

        if(map.get(num).equals(val)){
            System.out.println("User verified!");
        }else{
            System.out.println("Invalid credentials!");
        }

        sc.close();
    }
}
