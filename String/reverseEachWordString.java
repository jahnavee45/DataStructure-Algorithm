public class reverseEachWordString {
    public static void main(String[] args) {
        reverseWord("Hello from Java");
    }

    public static void reverseWord(String str){
        String [] words = str.split(" ");
        String revStr = "";
        for(String word : words){
            String revWord = "";
            for(int j = word.length()-1; j >= 0; j--){
                revWord += word.charAt(j);
            }
            revStr = revStr + revWord + " ";
        }

        System.out.println(str);
        System.out.println(revStr);
    }
}
