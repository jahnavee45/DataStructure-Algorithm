public class characterCombo {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        String combo = "";
        if(str1.length() != 0){
            if(str2.length() != 0){
                combo = "" + str1.charAt(0) + str2.charAt(str2.length() - 1);
            }else{
                combo = "" + str1.charAt(0) + "#";
            }
        }else{
            if(str2.length() != 0){
                combo = "" + "#" + str2.charAt(str2.length() - 1);
            }else{
                combo = "" + "#" + "#";
            }
        }
        System.out.println(combo);
    }
}
