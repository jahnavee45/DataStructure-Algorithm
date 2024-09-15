public class lengthOfLastWord {

    static int countLength(String str){
        int count = 0;
        str = str.trim();
        int i = str.length()-1;
        while(str.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = " This is an example ";
        int res = countLength(str);
        System.out.println("The length of the last word is " + res);
    }
}
