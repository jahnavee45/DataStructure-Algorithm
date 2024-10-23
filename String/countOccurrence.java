package String;

import java.util.Scanner;

public class countOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        System.out.println("Enter the character to find its occurrence:");
        char ch = sc.next().charAt(0);
        System.out.println("The total number of '" + ch + "' present in the given string is " + totalCount(str, ch));
    }

    private static int totalCount(String str, char ch) {
        int count = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
