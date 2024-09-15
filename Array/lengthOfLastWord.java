public class lengthOfLastWord {

    static int countLength(String str, int n){
        int count = 0;
        int i = n-1;
        while(str.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "This is an example";
        int n = str.length();
        int res = countLength(str, n);
        System.out.println("The length of the last word is " + res);
    }
}
