import java.util.Arrays;

public class LongestPrefix {

    static String findPrefix(String[] s){
        StringBuffer st = new StringBuffer();

        Arrays.sort(s);
        String start = s[0];
        String end = s[s.length - 1];

        for(int i = 0; i < Math.min(start.length(), end.length()); i++){
            if(start.charAt(i) != end.charAt(i)){
                return st.toString();
            }
            st.append(start.charAt(i));
        }
        return st.toString();
    }
    public static void main(String[] args) {
        String[] s = {"flower", " flow", " flight"};

        String res = findPrefix(s);
        System.out.println("The longest common prefix is " + res);
    }
}
