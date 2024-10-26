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
        HashMap<Integer, Character> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            map.put(i, str.charAt(i));
        }

        for(int i = str.length()-1; i >= 0; i--){
            s.append(map.get(i));
        }

        String s1 = s.toString();
        String[] s2 = s1.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = s2.length - 1; i >= 0; i--){
            res.append(s2[i]).append(" ");
        }
        return res.toString().trim();
    }
}
