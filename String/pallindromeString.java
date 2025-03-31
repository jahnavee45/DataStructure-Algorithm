public class pallindromeString {
    public static void main(String[] args) {
        String s = "abba";

        int res = checkPallindrome(s);
        if (res == 0) {
            System.out.println("Is pallindrome");
        } else {
            System.out.println("Is not pallindrome");
        }
    }

    private static int checkPallindrome(String s) {
        String c = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            c += s.charAt(i);
        }

        if (c.equals(s)) {
            return 0;
        }

        return 1;
    }
}
