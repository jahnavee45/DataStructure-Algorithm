package String;

public class reverseStirng2 {
    public static void main(String[] args) {
        String str = "hello world";
        char[] ch = new char[str.length()];
        int j = 0;

        for(int i = str.length() - 1; i >=0; i--){
            ch[j++] = str.charAt(i);
        }
        String str1 = new String(ch);
        System.out.println(str1);
    }
}
