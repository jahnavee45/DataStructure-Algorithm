package String;

import java.util.HashMap;

public class reverseEachWord {
    public static void main(String[] args) {
        String str = "sky is blue";
        System.out.println("Before reversing: " + str);
        System.out.println("After reversing: " + reverseOperation(str));
    }

    private static String reverseOperation(String str) {
        StringBuilder s = new StringBuilder();
        StringBuilder res = new StringBuilder();
        HashMap<Integer, Character> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            map.put(i, str.charAt(i));
        }

        for(int i = str.length()-1; i >= 0; i--){
            s.append(map.get(i));
        }

        str = s.toString();
        String[] s2 = str.split(" ");
        
        for(int i = s2.length - 1; i >= 0; i--){
            res.append(s2[i]).append(" ");
        }
        // trim trailing spaces
        return res.toString().trim();
    }
}
