import java.util.HashMap;

public class validAnagram {

    static boolean checkAnagram(String s, String c) {

        if (s.length() != c.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (char i : c.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) - 1);
        }

        for (int i : map.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String c = "nagaraa";

        boolean res = checkAnagram(s, c);
        if(res == true){
            System.out.println("Is a valid anagram");
        }else{
            System.out.println("Is not a valid anagram");
        }
    }
}
