package String;

public class reverseString {
    public static void main(String[] args) {
        String str = "aabbcc";
        String str1 = "";

        for(int i = str.length()-1; i >= 0; i--){
            str1 += str.charAt(i);
        }

        System.out.println("Before reversing:" + str);
        System.out.println("After reversing: " + str1);
        System.out.println("After reversing using recursion: " + doReverse(str));
    }

    private static String doReverse(String str) {
        if(str.isEmpty()){
            return str;
        }

        return doReverse(str.substring(1)) + str.charAt(0);
    }
}
