public class firstOcurrenceSubstring {

    static int indexOfFirst(String s, String c){
        int a = c.length();
        int i = 0, j = 0;

        while(j < s.length()){
            if(j - i + 1 == a){
                String str = s.substring(i, j + 1);
                    if(c.equals(str)){
                        return i;
                    }
                    i++;
            }
            j++;
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "sabbutsad";
        String c = "sad";

        System.out.println("The first occurrence of subtring is " + indexOfFirst(s, c));
    }
}
