import java.util.HashMap;

public class longestSubsequence {
    public static void main(String[] args) {
        String str ="aabcbcabcd";
        String res = findLongestSubsequence(str);
        System.out.println(res);
    }

    public static String findLongestSubsequence(String str){
        String res = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.getOrDefault(str.charAt(i), map.get(str.charAt(i)) - 1);
            }
            else{
                map.put(str.charAt(i), 1);
                res += str.charAt(i);
            }
        }
        return res;
    }
}
