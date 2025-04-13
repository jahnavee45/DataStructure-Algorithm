public class IsSubsequence {

    static boolean checkIfPresent(String s, String c){
        int i = 0, j = 0;

        while(i < c.length() && j < s.length()){
            if(c.charAt(i) == s.charAt(j)){
                j++;
            }
            i++;
        }

        if(j != s.length()){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "b";
        String c = "adbfc";
        boolean res = checkIfPresent(s, c);

        if(res == true){
            System.out.println("Subsequence is present");
        }else{
            System.out.println("Subsequence is not present");
        }
    }
}
