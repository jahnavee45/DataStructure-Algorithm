package GeneralUseCase;

import java.util.HashMap;

public class hello {
    public static void main(String[] args) {
        String s = "hello jane!";
        System.out.println("Say " + s);
        
        System.out.println("After Reversing:" + reverse(s));
        System.out.println("After Reversing Each Word:" + reverseEachWord(s));
    }

    public static String reverse(String s){
        String str = "";
        for(int i = s.length()-1; i >= 0; i--){
            str += s.charAt(i);
        }
        return str;
    }

    public static String reverseEachWord(String s){
        String res;

        return res;
    }
}
