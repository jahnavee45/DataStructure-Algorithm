package String;

public class words {
    public static void main(String[] args) {
        String st = "hello";
        for(char c : st.toCharArray()){
            System.out.print(c);
        }
        System.out.println();

        StringBuilder s = new StringBuilder();
        s.append(st);
        s.reverse();
        System.out.println(s);
    }
}
