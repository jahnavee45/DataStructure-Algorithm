public class validPallindrome {

    static boolean checkPallindrome(String s){
        s = s.replaceAll("\\p{Punct}", "");
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();

        int a = 0, b = s.length() - 1;
        while(a < b){
            if(s.charAt(a) != s.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "rac, a car";
        boolean res = checkPallindrome(str);
        if(res == true){
            System.out.println("Is a valid palindrome");
        }else{
            System.out.println("Is not a valid palindrome");
        }
    }
}
