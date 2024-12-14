package GeneralUseCase;

import java.util.HashMap;

public class hello {
    public static void main(String[] args) {
        String s = "hello!";
        System.out.println("Say " + s);
        
        System.out.println("After Reversing:" + reverse(s));
    }

    public static String reverse(String s){
        String str = "";
        for(int i = s.length()-1; i >= 0; i--){
            str += s.charAt(i);
        }
        return str;
    }
}
