public class integerRoman {
    public static void main(String[] args) {
        int n = 3456;

        System.out.println("The roman value of integer " + n + " is " + findRoman(n));
            }
        
            private static String findRoman(int n) {
                String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
                int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
                String res = new String();

                int i = 0;
                while(n > 0){
                    if(n >= val[i]){
                        res += roman[i];
                        n -= val[i];
                    }else{
                        i++;
                    }
                }
                return res;
            }
}
