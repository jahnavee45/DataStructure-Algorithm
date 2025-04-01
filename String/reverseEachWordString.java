public class reverseEachWordString {
    public static void main(String[] args) {
        reverseWord("Hello World");
    }

    public static void reverseWord(String str){
        String [] words = str.split("//s");
        String revStr = "";
        for(String word : words){
            String revWord = "";
            for(int j = word.length()-1; j >= 0; j--){
                revWord += word.charAt(j);
            }
            revStr += revWord + " ";
        }

        System.out.println(str);
        System.out.println(revStr);
    }
}
