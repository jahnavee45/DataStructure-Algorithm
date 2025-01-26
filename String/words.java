package String;

public class words {
    public static void main(String[] args) {
        String st = "hello world";
        for(char c : st.toCharArray()){
            System.out.print(c);
        }
        System.out.println();

        StringBuilder s = new StringBuilder();
        s.append(st);
        s.reverse();
        System.out.println(s);

        StringBuilder sb = new StringBuilder();
        String[] str = st.split(" ");
        for(String ss:str){
            sb.append(ss);
            System.out.print(sb.reverse() + " ");
            sb.setLength(0);       
        }
        
    }
}
