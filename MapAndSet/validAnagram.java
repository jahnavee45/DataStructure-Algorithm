package MapAndSet;

import java.util.HashMap;

public class validAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t)? "Yes":"No");
    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                return false;
            }else{
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
            }           
        }

        for(int count : map.values()){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
