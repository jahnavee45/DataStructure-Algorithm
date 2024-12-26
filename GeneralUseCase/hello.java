package GeneralUseCase;

import java.util.Arrays;
import java.util.stream.Collectors;

public class hello {
    public static void main(String[] args) {
        String s = "java";
        System.out.println("Say " + s);
        
        System.out.println("After reversing:" + reverse(s));
        System.out.println("After reversing each word:" + reverseEachWord(s));
    }

    public static String reverse(String s){
        String str = "";
        for(int i = s.length()-1; i >= 0; i--){
            str += s.charAt(i);
        }
        return str;
    }

    public static String reverseEachWord(String s){
        String res = Arrays.asList(s.split(" "))
                    .stream().map(str -> new StringBuilder(str).reverse())
                    .collect(Collectors.joining(" "));

        return res;
    }
}
