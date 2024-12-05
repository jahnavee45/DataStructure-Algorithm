package MapAndSet;

import java.util.HashMap;

public class isomorphic {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s, t)?"Yes is isomorphic":"No is not isomorphic");
    }
    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (!map.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            } else if (map.containsValue(t.charAt(i))) {
                return false;
            } else {
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
    
}