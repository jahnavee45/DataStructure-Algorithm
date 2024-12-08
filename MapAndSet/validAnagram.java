package MapAndSet;

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
        return true;
    }
}
