package MapAndSet;

import java.util.HashMap;

public class ransomeNote {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "ca";
        System.out.println(isRansome(str1, str2)?"Yes":"No");
    }

    public static boolean isRansome(String str1, String str2){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str1.length(); i++){
            char c = str1.charAt(i);

            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c) + 1);
            }
        }

        for(int i = 0; i < str2.length(); i++){
            char c = str2.charAt(i);

            if(map.containsKey(c) && map.get(c) > 0){
                map.put(c, map.get(c) - 1);
            }else{
                return false;
            }
        }
        return true;
    }
}
