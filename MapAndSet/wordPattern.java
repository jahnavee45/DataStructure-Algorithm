package MapAndSet;

import java.util.HashMap;

public class wordPattern {
    public static void main(String[] args) {
        String p = "abba";
        String w = "dog cat cat dog";

        System.out.println(isMatch(p, w)?"matches":"not match");
    }

    public static boolean isMatch(String p, String w){
        w = w.trim();
        String st[] = w.split(" ");
        if(p.length() != st.length){
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        for(int i = 0; i < p.length(); i++){
            if(!map.containsKey(p.charAt(i))){
                if(!map.containsValue(st[i])){
                    map.put(p.charAt(i), st[i]);
                }else{
                    return false;
                }
            }else{
                if(st[i].compareTo(map.get(p.charAt(i))) != 0){
                    return false;
                }
            }
        }
        return true;
    }
}
