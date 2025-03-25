package String;

public class reverseStirng2 {
    public static void main(String[] args) {
        String str = "hello java";
        char[] ch = new char[str.length()];
        int j = 0;

        for(int i = str.length() - 1; i >=0; i--){
            ch[j++] = str.charAt(i);
        }
        String str1 = new String(ch);
        System.out.println("Using character array\n:" + str1);

        StringBuilder res = new StringBuilder();
        for(int i = str.length() - 1; i >=0; i--){
            res.append(str.charAt(i));
        }
        System.out.println("Using StringBuilder\n:" + res.toString());
    }
}
