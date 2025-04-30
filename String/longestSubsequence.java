import java.util.HashMap;

public class longestSubsequence {
    public static void main(String[] args) {
        String str ="abcbcabc";
        String res = findLongestSubsequence(str);
        System.out.println(res);
    }

    public static String findLongestSubsequence(String str){
        String res = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                break;
            }
            else{
                map.put(str.charAt(i), 1);
                res += str.charAt(i);
            }
        }
        return res;
    }
}
