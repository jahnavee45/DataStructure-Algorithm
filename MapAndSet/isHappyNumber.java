package MapAndSet;

import java.util.HashSet;

public class isHappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n)?"Yes is happy number":"No is not happy number");
    }

    public static boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<>();

        while(n != 0){
            if(!set.contains(n)){
                set.add(n);
                n = getNumber(n){
                    if(n == 1){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
