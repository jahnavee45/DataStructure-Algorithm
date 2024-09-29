import java.util.*;

public class validParenthesis {

    static boolean checkValid(String s){
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else{
                if(!st.empty() &&
                (st.peek() == '(' && s.charAt(i) == ')') ||
                (st.peek() == '{' && s.charAt(i) == '}') ||
                (st.peek() == '[' && s.charAt(i) == ']')
                ){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        String s = "({)";
        boolean res = checkValid(s);
        if(res == true){
            System.out.println("Valid parenthesis");
        }else{
            System.out.println("Invalid parenthesis");
        }
    }
}
