public class reverseSentence {
    public static void main(String[] args) {
        String s = "sky is blue";
        System.out.println("Before reversing:" + s);
        System.out.println("After reversing:" + findReverse(s));
    }

    private static String findReverse(String s) {
        String[] str = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            res.append(str[i]);
            if (i != 0) {
                res.append(" ");
            }
        }

        return res.toString().trim();
    }
}
