import java.util.Stack;

public class validationBrackets {
    public static void main(String[] args) {
        String[] str = {"[", "]", "[", "]", "{"};

        boolean isValid = checkValidation(str);
        System.out.println("The brackets are " + (isValid ? "valid":"not valid"));
    }

    public static boolean checkValidation(String[] str){
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < str.length; i++){
         if(str[i] == "[" || str[i] == "{" || str[i] == "("){
            stack.push(str[i]);
         }  else{
            if(!stack.isEmpty() &&
            (
                (stack.peek() == "[" && str[i] == "]")||
                (stack.peek() == "{" && str[i] == "}")||
                (stack.peek() == "(" && str[i] == ")")
            )){
                stack.pop();
            }else{
                return false;
            }
         }
        }
        return stack.empty();
    }
}
