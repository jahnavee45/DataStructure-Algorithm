package String;

public class countOccurrence {
    public static void main(String[] args) {
        String str = "A cat sat on the mat";
        char ch = 'a';
        System.out.println("The total number of " + ch + " present in the given string is " + totalCount(str, ch));
    }

    private static int totalCount(String str, char ch) {
        int count = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
